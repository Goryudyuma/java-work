import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt(), m = sc.nextInt();
			int[][] a = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int[] x = new int[m];
			for (int i = 0; i < m; i++) {
				x[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				int ans = 0;
				for (int j = 0; j < m; j++) {
					ans += x[j] * a[i][j];
				}
				System.out.println(ans);
			}
		}
	}
}
