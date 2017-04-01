import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long[] A = new long[N * 3];
			for(int i = 0; i < N * 3; i++) {
				A[i] = sc.nextLong();
			}
			Arrays.sort(A);
			long ans = 0;
			for(int i = 0; i < 2 * N; i += 2) {
				ans += A[N * 3 - i - 2];
			}
			System.out.println(ans);
		}
	}
}

