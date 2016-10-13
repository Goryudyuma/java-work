import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			boolean[][] A = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				int now = sc.nextInt() - 1;
				int M = sc.nextInt();
				for (int j = 0; j < M; j++) {
					A[now][sc.nextInt() - 1] = true;
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (A[i][j]) {
						System.out.print(1);
					} else {
						System.out.print(0);
					}
					if (j == N - 1) {
						System.out.print("\n");
					} else {
						System.out.print(" ");
					}
				}
			}
		}
	}
}
