import java.util.*;

class Main {
	private static int[] UF;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		UF = new int[N];
		int[] F = new int[N];
		for (int i = 0; i < N; i++) {
			UF[i] = i;
		}
		for (int i = 0; i < K; i++) {
			int M = sc.nextInt();
			int now = sc.nextInt()-1;
			for (int j = 0; j < M - 1; j++) {
				UF[parent(sc.nextInt()-1)] = now;
			}
		}
		int R = sc.nextInt();
		for (int i = 0; i < R; i++) {
			int P = sc.nextInt()-1, Q = sc.nextInt()-1;
			if (UF[parent(P)] == UF[parent(Q)]) {
				F[P]++;	F[Q]++;
			}
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (F[i] != 0) {
				ans++;
			}
		}
		System.out.println(ans);

	}
	private static int parent(int n) {
		if (UF[n] == n) {
			return n;
		} else {
			return UF[n] = parent(UF[n]);
		}
	}
}
