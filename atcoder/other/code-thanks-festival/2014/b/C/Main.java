import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] V = new int[N];
		for (int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (V[i] / 2 < sc.nextInt()) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
