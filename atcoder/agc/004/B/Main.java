import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), x = sc.nextLong();
		long[] a = new long[(int)N];
		for (int i = 0; i < N ; i++) {
			a[i] = sc.nextLong();
		}
		long ans = 1L << 60;
		long[] amemo = new long[(int)N];
		for (int i = 0; i < N; i++) {
			amemo[i] = 1L << 60;
		}
		for (long i = 0; i < N; i++) {
			long memo = i * x;
			for (long j = 0; j < N; j++) {
				amemo[(int)j] = Math.min(amemo[(int)j], a[(int)((j - i + N) % N)]);
				memo += amemo[(int)j];
			}
			ans = Math.min(ans, memo);
		}
		System.out.println(ans);
	}
}
