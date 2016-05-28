import java.util.*;


class Main {
	public static int dp[];
	public static int MM = 1000001;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		dp = new int[MM];
		for (int i = 0; i < MM; i++) {
			dp[i] = -1;
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				break;
			}
			System.out.println(recursion(N));	
		}
	}
	public static int recursion(int in) {
		if (in == 1) {
			return 0;
		}
		if (in < MM) {
			if (dp[in] != -1) {
				return dp[in];
			} else {
				if (in % 2 == 1) {
					return dp[in] = recursion(in * 3 + 1) + 1;
				} else {
					return dp[in] = recursion(in / 2) + 1;
				}
			}
		} else {
			if (in % 2 == 1) {
				return recursion(in * 3 + 1) + 1;
			} else {
				return recursion(in / 2) + 1;
			}
		}
	}
}
