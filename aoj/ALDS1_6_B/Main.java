import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}

			int x = A[N - 1];
			int i = -1;
			for (int j = 0; j < N - 1; j++) {
				if (A[j] <= x) {
					i++;
					int tmp = A[i];
					A[i] = A[j];
					A[j] = tmp;
				}
			}
			int tmp = A[i + 1];
			A[i + 1] = A[N - 1];
			A[N - 1] = tmp;
			for (int k = 0; k < N; k++) {
				if (k == i + 1) {
					System.out.print("["+A[k]+"]");
				} else {
					System.out.print(A[k]);
				}
				if (k == N - 1) {
					System.out.print("\n");
				} else {
					System.out.print(" ");
				}
			}
		}
	}
}
