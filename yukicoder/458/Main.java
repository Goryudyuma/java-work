import java.util.*;

class Main {
	public static void main(String args[]) {
		long[] dp = new long[20001];
		boolean[] prime = new boolean[20001];
		prime[0] = prime[1] = true;

		for (int i = 0; i < 20001; i++) {
			dp[i] = (1 << 20) * -1;
		}

		dp[0] = 0;


		for (int i = 2; i < 20001; i++) {
			if (!prime[i]) {
				for (int j = 2; i * j < 20001; j++) {
					prime[i*j] = true;
				}
			}	
		}

		for (int i = 20000; i >= 0; i--) {
			if (!prime[i]) {
				for (int j = 20000-i; j >= 0; j--) {
					dp[j+i] = Math.max(dp[j+i], dp[j] + 1);
				}
			}
		}

		try (Scanner sc = new Scanner(System.in)) {
			long ans = dp[sc.nextInt()];
			if (ans < 0) {
				ans = -1;
			}
			System.out.println(ans);
		}
	}
}
