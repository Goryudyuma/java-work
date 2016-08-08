import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int[] x = new int[M+1];
		for (int i = 0; i < N; i++) {
			int V = sc.nextInt(), T = sc.nextInt();
			for (int j = M; j >= T; j--) {
				x[j] = Math.max(x[j], x[j-T] + V);
			}
		}
		int ans = 0;
		for (int i = 0; i < M+1; i++	) {
			ans = Math.max(x[i], ans);
		}
		System.out.println(ans);
	}
}
