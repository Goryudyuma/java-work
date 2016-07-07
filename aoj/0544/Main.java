import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt(), M = sc.nextInt();
			if (N == 0 && M == 0) {
				break;
			}
			int[] D = new int[N];
			int[] Ms = new int[M];
			for (int i = 0; i < N; i++) {
				D[i] = sc.nextInt();
			}
			int now = 0;
			boolean f = true;
			for (int i = 0; i < M; i++) {
				now += sc.nextInt();
				if (f) {
					if (now < N - 1 && D[now] != 0) {
						now += D[now];
					}
					if (now >= N - 1) {
						System.out.println(i + 1);
						f=false;
					}
				}
			}
		}
	}
}
