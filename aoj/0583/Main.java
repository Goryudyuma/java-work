import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = sc.nextInt();
		for (int i = 0; i < N - 1; i++) {
			ans = gcd(ans, sc.nextInt());
		}
		for (int i = 1; i <= ans; i++) {
			if (ans % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static int gcd(int a, int b) {
		if (a < b) {
			return gcd(b, a);
		}
		if (b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
}
