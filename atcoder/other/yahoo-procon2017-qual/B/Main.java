import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt(), K = sc.nextInt();
			long[] A = new long[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextLong();
			}
			Arrays.sort(A);
			long ans = 0;
			for (int i = 0; i < K; i++) {
				ans += i + A[i];
			}
			System.out.println(ans);
		}
	}
}
