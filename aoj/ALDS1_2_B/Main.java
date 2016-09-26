import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			int ans = 0;
			for (int i = 0; i < N; i++) {
				int minj = i;
				for (int j = i; j < N; j++) {
					if (A[j] < A[minj]) {
						minj = j;
					}
				}
				if (i != minj) {
					ans++;
				}
				int tmp = A[i];
				A[i] = A[minj];
				A[minj] = tmp;
			}
			for (int i = 0; i < N; i++) {
				System.out.print(A[i]);
				if (i < N - 1) {
					System.out.print(" ");
				} else {
					System.out.print("\n");
				}
			}
			System.out.println(ans);
		}
	}
}
