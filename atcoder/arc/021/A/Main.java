import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				A[i][j] = sc.nextInt();
				if ((i != 0 && A[i][j] == A[i-1][j]) || (j != 0 && A[i][j] == A[i][j-1])) {
					System.out.println("CONTINUE");
					return;
				}
			}
		}
		System.out.println("GAMEOVER");
		return;
	}
}
