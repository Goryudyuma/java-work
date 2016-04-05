import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int memo = 0;
			for (int j = 0; j < m; j++) {
				int x = sc.nextInt();
				if (x == 1) {
					memo++;	
				}
			}
			ans = Math.max(memo, ans);
		}
		System.out.println(ans);
	}
}
