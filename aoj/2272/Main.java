import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int M[][] = new int[H][W];
		int dp[][] = new int[H][W];
		for (int i = 0; i < H; i++) {
			String S = sc.next();
			for (int j = 0; j < W; j++) {
				M[i][j] = Integer.parseInt(""+S.charAt(j));
				dp[i][j] = 1 << 28;
			}
		}
		dp[0][0] = M[0][0];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (i > 0) {
					dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + M[i][j]);
				}
				if (j > 0) {
					dp[i][j] = Math.min(dp[i][j], dp[i][j-1] + M[i][j]);
				}
			}
		}
		System.out.println(dp[H-1][W-1]);
	}
}
