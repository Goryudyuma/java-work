import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		int[][] dp = new int[H + 1][W + 1];
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				dp[i][j] = sc.nextInt();
				if ((i + j) % 2 == 0 ) {
					dp[i][j] *= -1;
				}
			}
		}
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				dp[i][j] += dp[i][j-1];
			}
		}
		for (int j = 1; j <= W; j++) {
			for (int i = 1; i <= H; i++) {
				dp[i][j] += dp[i - 1][j];
			}
		}
		int ans = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				for (int k = i + 1; k <= H; k++) {
					for (int l = j + 1; l <= W; l++) {
						if (dp[i][j] + dp[k][l] - dp[i][l] - dp[k][j] == 0) {
							if (ans < (k - i) * (l - j)) {
								ans = (k - i) * (l - j);
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
