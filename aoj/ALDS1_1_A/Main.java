import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int k = 0; k < N; k++) {
			System.out.print(A[k]);
			if (k!=N-1) {
				System.out.print(" ");
			} else {
				System.out.print("\n");
			}
		}
		for (int i = 1; i < N; i++) {
			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			for (int k = 0; k < N; k++) {
				System.out.print(A[k]);
				if (k!=N-1) {
					System.out.print(" ");
				} else {
					System.out.print("\n");
				}
			}
		}
	}
}
