import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Long m = sc.nextLong();
		Long n = sc.nextLong();
		dp = new long[4][61];
		System.out.println(saiki(m, n));
	}

	public static long[][] dp;
	public static long saiki(long m, long n) {
		int mint = (int)m; 
		int nint = (int)n; 
		if (mint == 2) {
			return m * n + 3;
		} else if(mint == 1) {
			return m * n + 2; 
		}
		if (nint < 61) {
			if (dp[mint][nint] != 0) {
				return dp[mint][nint];
			}
			if (m == 0) {
				return dp[mint][nint] = n + 1;
			} else if(n == 0) {
				return dp[mint][nint] = saiki(m - 1, new Long(1));
			} else {
				return dp[mint][nint] = saiki(m - 1, saiki(m, n - 1));
			}
		}
		if (m == 0) {
			return n + 1;
		} else if(n == 0) {
			return saiki(m - 1, new Long(1));
		} else {
			return saiki(m - 1, saiki(m, n - 1));
		}
	}
}
