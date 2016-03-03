import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String S = sc.next();
			int now = 0;
			int count = 0;
			while (now + 4 < S.length()) {
				String ss = S.substring(now, now+5);
				if (ss.equals("tokyo") || ss.equals("kyoto")) {
					now += 4;
					count++;
				} else {
					now++;
				}
			}
			System.out.println(count);
		}
	}
}
