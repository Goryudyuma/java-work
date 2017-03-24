import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			long N = sc.nextLong(), D = sc.nextLong();
			System.out.println(N / gcd(N, D) - 1);
		}
	}
	private static long gcd(long A, long B) {
		if (A < B) {
			return gcd(B, A);
		}
		if (B == 0) {
			return A;
		}
		return gcd(B, A%B);
	}
}
