import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N, K;
		N = sc.nextInt();
		K = sc.nextInt();

		int num = 0, ans = 0, prev = 0;
		for (int i = 0; i < N; i++) {
			int A;
			A = sc.nextInt();
			if (A > prev) {
				num++;
			} else {
				ans += Math.max(num - K + 1 , 0);
				num = 1;
			}
			prev = A;
		}
		ans += Math.max(num - K + 1 , 0);
		System.out.println(ans);
	}
}
