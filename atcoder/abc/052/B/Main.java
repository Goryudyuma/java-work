import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			String S = sc.next();
			int now = 0, ans = 0;
			for (int i = 0; i < N; i++) {
				if (S.charAt(i) == 'I') {
					now++;
					ans = Math.max(now, ans);
				} else {
					now--;
				}
			}
			System.out.println(ans);
		}
	}
}
