import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] cost = new int[N];
			for (int i = 0; i < N; i++) {
				cost[i] = sc.nextInt();
			}

			int M = sc.nextInt();
			int[][] bridge = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					bridge[i][j] = 1 << 25;
				}
				bridge[i][i] = 0;
			}
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
				bridge[a][b] = bridge[b][a] = c;
			}
			for (int k = 0; k < N; k++) {
				for (int i = 0; i < N; i++) {
					for (int j = i + 1; j < N; j++) {
						bridge[i][j] = Math.min(bridge[i][j], bridge[i][k] + bridge[k][j]);
						bridge[j][i] = bridge[i][j];
					}
				}
			}
			int ans = 1 << 26;
			for (int i = 1; i < N - 1; i++) {
				for (int j = 1; j < N - 1; j++) {
					if (i != j) {
						ans = Math.min(ans, bridge[0][i] + cost[i] + bridge[i][j] + cost[j] + bridge[j][N-1]);
					}
				}
			}
			System.out.println(ans);
		}
	}
}
