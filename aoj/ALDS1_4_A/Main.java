import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] S = new long[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.nextLong();
		}
		int Q = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < Q; i++) {
			long T = sc.nextLong();
			for (int j = 0; j < N; j++) {
				if (T == S[j]) {
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
