import java.util.*;

class Main {
	public static int map[][];
	public static int t, n;
	public static int dx[] = {0,1,1,0,-1,-1};
	public static int dy[] = {1,1,0,-1,-1,0};

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			t = sc.nextInt();
			n = sc.nextInt();
			if (t == 0 && n ==0) {
				break;
			}
			map = new int[1000][1000];
			for (int i = 0; i < 1000; i++) {
				for (int j = 0; j < 1000; j++) {
					map[i][j] = 1 << 30;
				}
			}
			for (int i = 0; i < n; i++) {
				map[sc.nextInt() + 500][sc.nextInt() + 500] = -1;
			}
			Queue<Integer[]> que = new ArrayDeque<Integer[]>();
			int nx = sc.nextInt() + 500;
			int ny = sc.nextInt() + 500;
			que.add(new Integer[]{nx, ny});
			map[nx][ny] = 0;
			while (que.size()!=0) {
				Integer[] now = que.poll();
				int x = now[0];
				int y = now[1];
				if (map[x][y] >= t) {
					continue;
				}
				for (int i = 0; i < 6; i++) {
					if (map[x + dx[i]][y + dy[i]] > map[x][y] + 1) {
						map[x + dx[i]][y + dy[i]] = map[x][y] + 1;
						que.add(new Integer[]{x + dx[i],y + dy[i]});
					}
				}
			}		

			int ans = 0;
			for (int i = 0; i < 1000; i++) {
				for (int j = 0; j < 1000; j++) {
					if (map[i][j] >= 0 && map[i][j] != 1 << 30) {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}
