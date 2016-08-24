import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong(), W = sc.nextLong(), K = sc.nextLong();
		long gcdn = gcd(W, K);
		W /= gcdn;
		K /= gcdn;
		if (W % K == 0) {
			System.out.println(0);
		} else {
			System.out.println((W/2-1)*K);
		}
	}
	static long gcd(long a, long b) {
		if (a < b) {
			return gcd(b, a);
		}
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
}
