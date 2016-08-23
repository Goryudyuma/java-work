import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		int b = 0, e = 0;
		int c = K;
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
			if (H[i] == 0) {
				c--;
			}
			if (c >= 0) {
				e = i;	
			}
		}
		if (c >= 0) {
			System.out.println(N);
			return;
		}
		e++;
		int ans = e - b;
		while (e != N) {
			if (b - 1 >= 0 && H[b - 1] == 0) {
				e++;
				while (e < N && H[e] == 1) {
					e++;
				}
			}
			ans = Math.max(ans, e - b);
			b++;
		}
		System.out.println(ans);
	}
}
