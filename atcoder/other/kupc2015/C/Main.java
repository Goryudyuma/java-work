import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int Tcount = 0; Tcount < T; Tcount++) {
			int N = sc.nextInt();
			int[][] len = new int[N][N];
			int[][] WF = new int[N][N];
			boolean ans = true;
			int min = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					len[i][j] = sc.nextInt();
					if (len[i][j] == -1) {
						len[i][j] = Integer.MAX_VALUE / 6;
					}
					WF[i][j] = len[i][j];
				}
				if (len[i][i] != 0) {
					ans = false;
				}
			}
			for (int k = 0; k < N; k++) {
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (len[i][j] > len[i][k] + len[k][j]) {
							len[i][j] = len[i][k] + len[k][j];
						}
					}
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (len[i][j] >= Integer.MAX_VALUE) {
						ans = false;
					} else {
						if (len[i][j] != WF[i][j]) {
							ans = false;
						}
					}
				}
			}
			if (ans) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
