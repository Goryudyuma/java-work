import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int prev = sc.nextInt();
		int up = 0;
		int down = 0;
		int ans = 1;
		for (int i = 1; i < N; i++) {
			int now = sc.nextInt();
			if (now < prev) {
				down++;
			} else {
				if (down != 0) {
					int ansmemo = down + up + 1;
					if (ans < ansmemo) {
						ans = ansmemo;
					}
					up = 0;
					down = 0;
				}
				up++;
			}
			prev = now;
		}
		int ansmemo = down + up + 1;
		if (ans < ansmemo) {
			ans = ansmemo;
		}

		System.out.println(ans);
	}
}
