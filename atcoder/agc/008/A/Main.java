import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			long A = sc.nextLong(), B = sc.nextLong();

			long ans = (long)1e11;
			if (A <= B) {
				ans = Math.min(ans, B - A);
			}
			A *= -1;
			if (A <= B) {
				ans = Math.min(ans, B - A + 1);
			}
			B *= -1;
			if (A <= B) {
				ans = Math.min(ans, B - A + 2);
			}
			A *= -1;
			if (A <= B) {
				ans = Math.min(ans, B - A + 1);
			}
			System.out.println(ans);
		}
	}
}
