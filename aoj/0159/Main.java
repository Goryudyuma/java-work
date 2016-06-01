import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			double nowmin = 300;
			int ans = 0;
			for (int i = 0; i < N; i++) {
				int j = sc.nextInt(), h = sc.nextInt(), w = sc.nextInt();
				if (Math.abs(w*10000./h/h - 22) < nowmin) {
					ans = j;
					nowmin = Math.abs(w*10000./h/h - 22);
				} else if (Math.abs(w*10000./h/h - 22) == nowmin) {
					ans = Math.min(ans, j);
				}
			}
			System.out.println(ans);
		}
	}
}
