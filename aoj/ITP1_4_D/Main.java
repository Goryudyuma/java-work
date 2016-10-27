import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			long N = sc.nextInt();
			long minv = 100000001L, maxv = -1000000000L, sumv = 0;
			for (int i = 0; i < N; i++) {
				long x = sc.nextInt();
				minv = Math.min(x, minv);
				maxv = Math.max(x, maxv);
				sumv += x;
			}
			System.out.println(minv + " " + maxv + " " + sumv);
		}
	}
}
