import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
			int[][] E = new int[C][A];
			for (int i = 0; i < C; i++) {
				for (int j = 0; j < A; j++) {
					E[i][j] = sc.nextInt();
				}
			}
			for (int i = -1; i <= 101; i++) {
				int memo = 0;
				for (int j = 0; j < C; j++) {
					int num = 0;
					for (int k = 0; k < A; k++) {
						if (E[j][k] >= i) {
							num++;
						}	
					}
					if (num >= B) {
						memo++;
					}
				}
				if (memo < D) {
					System.out.println(i - 1);
					break;
				}
			}
		}
	}
}
