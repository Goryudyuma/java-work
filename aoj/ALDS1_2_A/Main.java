import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] A = new int[N];
			int[] B = new int[N];
			
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
				B[i] = A[i];
			}
			Arrays.sort(B);
			for (int i = 0; i < N; i++) {
				System.out.print(B[i] + (i == N-1 ? "\n" : " "));
			}
			System.out.println(bubbleSort(A, N));
		}
	}
	private static int bubbleSort(int[] A, int N) {
		boolean flag = true;
		int ans = 0;
		while (flag) {
			flag = false;
			for (int j = N - 1; j >= 1; j--) {
				if (A[j] < A[j-1]) {
					int tmp = A[j];
					A[j] = A[j-1];
					A[j-1] = tmp;
					flag = true;
					ans++;
				}
			}
		}
		return ans;
	}
}
