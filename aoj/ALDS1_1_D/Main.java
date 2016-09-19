import java.util.*;

class Main {
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)) {
			long N = sc.nextLong();
			long min = 1L << 60;
			long ans = - (1L << 60);
			for (long i = 0; i < N; i++) {
				long now = sc.nextLong();
				ans = Math.max(ans, now - min);
				min = Math.min(min, now);
			}
			System.out.println(ans);
		}
	}
}
