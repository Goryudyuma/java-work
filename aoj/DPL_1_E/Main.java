import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String s1 = sc.next(), s2 = sc.next();
			int[][] dp = new int[s1.length()+1][s2.length()+1];
			for (int i = 0; i < s1.length() + 1; i++) {
				for (int j = 0; j < s2.length() + 1; j++) {
					dp[i][j] = 1 << 20;
					if (i == 0) {
						dp[i][j] = j;
					}
					if (j == 0) {
						dp[i][j] = i;
					}
				}
			}
			dp[0][0] = 0;
			for (int i = 1; i < s1.length() + 1; i++) {
				for (int j = 1; j < s2.length() + 1; j++) {
					if (s1.charAt(i-1) == s2.charAt(j-1)) {
						dp[i][j] = dp[i-1][j-1];
					} else {
						dp[i][j] = dp[i-1][j-1] + 1;
					}
					dp[i][j] = Math.min(dp[i][j],Math.min(dp[i-1][j], dp[i][j-1]) + 1);
				}
			}
			System.out.println(dp[s1.length()][s2.length()]);
		}
	}
}
