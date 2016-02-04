import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[3];
		int[] B = new int[3];
		for (int i = 0; i < 3; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);

		int ans = 0;
		for (int i = 0; i < 3; i++) {
			ans += Math.abs(A[i] - B[i]);
		}

		System.out.println(ans);
	}
}
