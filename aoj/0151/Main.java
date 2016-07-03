import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				break;
			}
			String[] S = new String[N];
			for (int i = 0; i < N; i++) {
				S[i] = sc.next();
			}
			int ans = 0;
			int dx[] = {0, 1, 1, 1};
			int dy[] = {1, 1, 0, -1};

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					for (int k = 0; k < 4; k++) {
						int count = 0;
						while (0 <= i + count * dx[k] && i + count * dx[k] < N && 0 <= j + count * dy[k] && j + count * dy[k] < N && S[i + count * dx[k]].charAt(j + count * dy[k]) == '1') {
							count++;
						}
						ans = Math.max(ans, count);
					}
					
				}
			}
			System.out.println(ans);
		}
	}
}
