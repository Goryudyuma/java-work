import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int n = sc.nextInt(), m = sc.nextInt(), ans = 0;
				if (n == 0 && m == 0) {
					break;
				}
				int[] P = new int[n];
				for (int i = 0; i < n; i++) {
					P[i] = sc.nextInt();
				}
				Arrays.sort(P);
				for (int i = 0; i < n / 2; i++) {
					int tmp = P[i];
					P[i] = P[n - i - 1];
					P[n - i - 1] = tmp;
				}
				for (int i = 0; i < n; i++) {
					if (i % m != m - 1) {
						ans += P[i];
					}
				}
				System.out.println(ans);
			}
		}
	}
}
