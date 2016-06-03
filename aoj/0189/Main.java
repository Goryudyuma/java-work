import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			int WF[][] = new int[10][10];
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					WF[i][j] = 1 << 25;
				}
				WF[i][i] = 0;
			}
			for (int i = 0; i < N; i++) {
				int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
				WF[a][b] = Math.min(WF[a][b], c);
				WF[b][a] = WF[a][b];
			}
			for (int k = 0; k < 10; k++) {
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						WF[i][j] = Math.min(WF[i][j], WF[i][k] + WF[k][j]);
						WF[j][i] = WF[i][j];
					}
				}
			}
			int ans = 0;
			int minlen = 1 << 25;
			for (int i = 0; i < 10; i++) {
				int tmp = 0;
				boolean f = false;
				for (int j = 0; j < 10; j++) {
					if (i!=j && WF[i][j] != 1 << 25) {
						tmp += WF[i][j];	
						f = true;
					}
				}
				if (f && tmp < minlen) {
					ans = i;
					minlen = tmp;
				}
			}
			System.out.println(ans + " " + minlen);
		}
	}
}
