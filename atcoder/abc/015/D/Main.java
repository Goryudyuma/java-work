import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int N = sc.nextInt(), K = sc.nextInt();
		int[][] dp = new int[K + 1][W + 1];

		dp[0][0] = 1;
		int ans = -2;
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			for (int j = W - A; j >= 0; j--) {
				for (int k = 0; k < K; k++) {
					if(dp[k + 1][j + A] < dp[k][j] + B) {
						dp[k + 1][j + A] = dp[k][j] + B;
						if (ans < dp[k + 1][j + A]) {
							ans = dp[k + 1][j + A];
						}
					}
				}
			}
		}
		if (ans < 1) {
			ans = 1;
		}
		System.out.println(ans - 1);
	}
}
