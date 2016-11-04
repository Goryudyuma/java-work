import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			double[] A = new double[N], B = new double[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextDouble();
			}
			for (int i = 0; i < N; i++) {
				B[i] = sc.nextDouble();
			}
			double[] ans = new double[4];
			for (int i = 0; i < N; i++) {
				double num = Math.abs(A[i] - B[i]);
				ans[0] += num;
				ans[1] += num * num;
				ans[2] += num * num * num;
				ans[3] = Math.max(ans[3], num);
			}
			ans[1] = Math.sqrt(ans[1]);
			ans[2] = Math.cbrt(ans[2]);
			System.out.println(ans[0]);
			System.out.println(ans[1]);
			System.out.println(ans[2]);
			System.out.println(ans[3]);
		}
	}
}
