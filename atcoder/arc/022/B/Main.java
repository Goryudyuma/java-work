import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int nowlong = 0;
		int[][] taste = new int[2][100001];
		for (int i = 1; i <= N; i++) {
			int A = sc.nextInt();
			if (taste[1][A] == 0) {
				if (taste[0][A] != 0) {
					nowlong = Math.min(nowlong, i - taste[0][A] - 1);
				}
				taste[1][A] = taste[0][A];
				taste[0][A] = i;
			} else {
				taste[1][A] = taste[0][A];
				taste[0][A] = i;
				nowlong = Math.min(nowlong, i - taste[1][A] - 1);
			}
			nowlong++;
			ans = Math.max(nowlong, ans);
		}
		System.out.println(ans);
	}
}
