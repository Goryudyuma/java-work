import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String S;
		S = sc.next();
		int now = 0, ans = 0;
		while (now != S.length() - 1) {
			now++;
			if (S.charAt(now) == '.') {
				continue;
			}
			now++;
			if (S.charAt(now) == '.') {
				continue;
			}
			now++;
			if (S.charAt(now) != '.') {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
