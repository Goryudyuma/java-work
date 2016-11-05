import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long[] S = new long[N];
			for (int i = 0; i < N; i++) {
				S[i] = sc.nextLong();
			}
			int Q = sc.nextInt();
			long[] T = new long[Q];
			for (int i = 0; i < Q; i++) {
				T[i] = sc.nextLong();
			}
			Arrays.sort(S);
			Arrays.sort(T);
			int ans = 0;
			for (int i = 0, j = 0; i < N && j < Q; i++) {
				if (S[i] == T[j]) {
					ans++;
					j++;
				} else if(S[i] > T[j]) {
					i--;
					j++;
				}
			}
			System.out.println(ans);
		}
	}
}
