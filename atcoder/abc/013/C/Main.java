import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N,H,A,B,C,D,E;
		N=sc.nextLong();
		H=sc.nextLong();
		A=sc.nextLong();
		B=sc.nextLong();
		C=sc.nextLong();
		D=sc.nextLong();
		E=sc.nextLong();
		long ans = (1L << 63) - 1;
		for (long i = 0; i <= N; i++) {
			long j = (E * N - H - (B + E) * i);
			if (j < 0) {
				j = 0;
			} else {
				j = j / (D + E) + 1;
			}
			if (i + j <= N) {
				ans = Math.min(ans, A * i + C * j);
			}
		}
		System.out.println(ans);
	}
}
