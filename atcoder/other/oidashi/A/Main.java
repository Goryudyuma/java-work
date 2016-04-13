import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int map[][] = new int[H][W];
		int Sx = 0, Sy = 0, Gx = 0, Gy = 0;
		for (int i = 0; i < H; i++) {
			String S = sc.next();
			for (int j = 0; j < W; j++) {
				if (S.charAt(j) == 'S') {
					Sx = i;
					Sy = j;
					map[i][j] = 1<<28;
				} else if (S.charAt(j) == 'G') {
					Gx = i;
					Gy = j;
					map[i][j] = 1<<28;
				} else if (S.charAt(j) == '#') {
					map[i][j] = -1;
				} else {
					map[i][j] = 1<<28;
				}
			}
		}
		int mapS[][] = new int[H][W];
		int mapG[][] = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				mapS[i][j] = map[i][j];
				mapG[i][j] = map[i][j];
			}
		}
		mapS[Sx][Sy] = 0;
		mapG[Gx][Gy] = 0;
		Queue<Integer> que1= new ArrayDeque<Integer>();
		Queue<Integer> que2= new ArrayDeque<Integer>();
		que1.add(Sx);
		que2.add(Sy);
		int dx[] = {0, 1, 0, -1};
		int dy[] = {-1, 0, 1, 0};
		while (true) {
			Integer x = que1.poll();
			if (x == null) {
				break;
			}
			Integer y = que2.poll();
			for (int i = 0; i < 4; i++) {
				Integer nextx = x + dx[i];
				Integer nexty = y + dy[i];
				if (0 <= nextx && nextx < H && 0 <= nexty && nexty < W) {
					if (mapS[nextx][nexty] > mapS[x][y] + 1) {
						mapS[nextx][nexty] = mapS[x][y] + 1;
						que1.add(nextx);
						que2.add(nexty);
					}
				}
			}
		}
		que1.add(Gx);
		que2.add(Gy);
		while (true) {
			Integer x = que1.poll();
			if (x == null) {
				break;
			}
			Integer y = que2.poll();
			for (int i = 0; i < 4; i++) {
				Integer nextx = x + dx[i];
				Integer nexty = y + dy[i];
				if (0 <= nextx && nextx < H && 0 <= nexty && nexty < W) {
					if (mapG[nextx][nexty] > mapG[x][y] + 1) {
						mapG[nextx][nexty] = mapG[x][y] + 1;
						que1.add(nextx);
						que2.add(nexty);
					}
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (map[i][j] == -1) {
					int memo = 1 << 28;
					for (int k = 0; k < 4; k++) {
						Integer nextSx = i + dx[k];
						Integer nextSy = j + dy[k];
						if (0 <= nextSx && nextSx < H && 0 <= nextSy && nextSy < W && mapS[nextSx][nextSy] != 1<<28 && mapS[nextSx][nextSy] != -1) {
							for (int l = 0; l < 4; l++) {
								Integer nextGx = i + dx[l];
								Integer nextGy = j + dy[l];
								if (0 <= nextGx && nextGx < H && 0 <= nextGy && nextGy < W && mapG[nextGx][nextGy] != 1<<28 && mapG[nextGx][nextGy] != -1) {
									memo = Math.min(memo, mapS[nextSx][nextSy] + mapG[nextGx][nextGy] + 2);
								}
							}
						}
					}
					if (memo != 1<<28) {
						ans = Math.max(ans, memo);
					}
				}
			}
		}
		System.out.println(ans);
	}
}
