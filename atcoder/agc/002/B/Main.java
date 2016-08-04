import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = 1;
		}
		boolean[] b = new boolean[N];
		b[0] = true;
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			x--; y--;
			num[x]--;
			num[y]++;
			if (b[x]) {
				b[y] = true;
			}
			if (num[x] == 0) {
				b[x] = false;
			}
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (b[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
