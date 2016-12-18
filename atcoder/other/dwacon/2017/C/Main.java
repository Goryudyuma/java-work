import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] A = new int[4];
			for (int i = 0; i < N; i++) {
				A[sc.nextInt() - 1]++;
			}
			int ans = 0;
			ans += A[1] / 2;
			A[1] %= 2;
			if (A[1] != 0) {
				ans++;
				A[0] -= Math.min(A[0], 2);
			}
			ans += A[3];
			A[3] = 0;
			int x = Math.min(A[2], A[0]);
			ans += x;
			A[2] -= x;
			A[0] -= x;
			ans += A[2];
			ans += A[0] /4;
			A[0] %= 4;
			if (A[0] != 0) {
				ans++;
			}
			
			System.out.println(ans);
		}
	}
}
