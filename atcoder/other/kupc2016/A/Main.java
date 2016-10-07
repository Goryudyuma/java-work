import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = 0;
			for (int i = 0; i < N; i++) {
				int n = sc.nextInt();
				if (!(a <= n && n < b)) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
