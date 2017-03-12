import java.util.*;


class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt(), C = sc.nextInt(), K = sc.nextInt();
			int[] T = new int[N];
			for (int i = 0; i < N; i++) {
				T[i] = sc.nextInt();
			}
			Arrays.sort(T);
			long ans = 0, now = -1000000000, count = 0;
			for (int i = 0; i < N; i++) {
				if (now + K < T[i] || count >= C) {
					ans++;
					count=0;
					now=T[i];
				}
				count++;
			}
			if (count != 0) {
				ans++;
			}
			System.out.println(ans - 1);
		}
	}
}
