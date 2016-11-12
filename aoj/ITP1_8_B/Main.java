import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				String S = sc.next();
				if (S.equals("0")) {
					break;
				}
				long ans = 0;
				for (int i = 0; i < S.length(); i++) {
					ans += S.charAt(i) - '0';
				}
				System.out.println(ans);
			}
		}
	}
}
