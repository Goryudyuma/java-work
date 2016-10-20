import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			for (int i = 1; i <= N; i++) {
				System.out.printf("node %d: key = %d, ", i, A[i-1]);
				if (i != 1) {
					System.out.printf("parent key = %d, ", A[i/2 - 1]);
				}
				if (i * 2 <= N) {
					System.out.printf("left key = %d, ", A[i * 2 - 1]);
				}
				if (i * 2 + 1 <= N) {
					System.out.printf("right key = %d, ", A[i * 2]);
				}
				System.out.print("\n");
			}
		}
	}
}
