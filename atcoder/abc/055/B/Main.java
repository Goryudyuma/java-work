import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long ans = 1;
			for (int i = 1; i <= N; i++) {
				ans *= i;
				ans %= 1000000007;
			}
			System.out.println(ans);
		}
	}
}
