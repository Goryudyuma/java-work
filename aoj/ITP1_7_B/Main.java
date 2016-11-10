import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int n = sc.nextInt(), x = sc.nextInt();
				if (n == 0 && x == 0) {
					break;
				}
				int ans = 0;
				for (int i = 1; i <= n && i <= x; i++) {
					for (int j = i + 1; j < n && i + j <= x && x - i > 2 * j; j++) {
						if (x - i - j <= n) {
							ans++;
						}
					}
				}
				System.out.println(ans);
			}
		}
	}
}
