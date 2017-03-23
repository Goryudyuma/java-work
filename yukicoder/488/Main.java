import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt(), M = sc.nextInt();
			boolean[][] f = new boolean[N][N];
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt(), b = sc.nextInt();
				f[a][b] = true;
				f[b][a] = true;
			}
			int ans = 0;
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					for (int k = j + 1; k < N; k++) {
						for (int l = k + 1; l < N; l++) {
							if (f[i][j]) {
								if (f[i][k] && f[k][l] && f[l][j] && !f[i][l] && !f[j][k]) {
									ans++;
								} else if(f[i][l] && f[k][l] && f[k][j] && !f[i][k] && !f[j][l])	{
									ans++;
								}
							} else {
								if (!f[k][l] && f[i][k] &&f[i][l] && f[j][k] && f[j][l]) {
									ans++;
								}
							}
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}
