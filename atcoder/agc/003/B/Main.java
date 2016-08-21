import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ans = 0L;
		long prev = 0L;
		for (long i = 0L; i < N; i++) {
			long now = sc.nextInt();
			ans += Math.min(prev, now);
			now -= Math.min(prev, now);
			ans += now / 2;
			now %= 2;
			prev = now;
		}
		System.out.println(ans);
	}
}
