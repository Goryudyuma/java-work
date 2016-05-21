import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int data[][] = new int[N][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			int ans = 0;
			for (int j = 0; j < 3; j++) {
				boolean f = true;
				for (int k = 0; k < N; k++) {
					if (i != k) {
						if (data[i][j] == data[k][j]) {
							f = false;
							break;
						}
					}
				}
				if (f) {
					ans += data[i][j];	
				}
			}
			System.out.println(ans);
		}
	}
}
