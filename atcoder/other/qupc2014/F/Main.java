import java.util.*;

class Main {
	public static void main(String args[]) {
		long mod = 1000000009L;
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt(), T = sc.nextInt(), M = sc.nextInt();
			long[][] dp = new long[T+1][M+1];
			dp[0][0] = 1;
			for (int i = 0; i < N; i++) {
				int D = sc.nextInt();
				for (int k = T - D; k >=0 ; k--) {
					dp[k + D][M] += dp[k][M];
					dp[k + D][M] %= mod;
				}
				for (int j = M - 1; j >= 0; j--) {
					for (int k = T - D; k >= 0; k--) {
						dp[k + D][j + 1] += dp[k][j];
						dp[k + D][j + 1] %= mod;
					}
				}
			}
			long ans = 0;
			for (int k = 0; k < T + 1; k++) {
				ans += dp[k][M];
				ans %= mod;
			}
			System.out.println(ans);
		}
	}
}
