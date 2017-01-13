import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long S = sc.nextLong();
			long[] A = new long[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextLong();
			}
			int i = 0, j = 0, ans = 100000000;
			long sum = 0;

			while (i < N) {
				while (j < N && sum < S) {
					sum += A[j];
					j++;
				}
				if (sum >= S) {
					ans = Math.min(j - i, ans);
				}
				sum -= A[i];i++;
			}
			if (ans == 100000000) {
				ans = 0;
			}
			System.out.println(ans);
		}
	}
}
