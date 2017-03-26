import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			int R = 0, L = 0;
			for (int i = 1; i < S.length(); i+=5) {
				if (S.charAt(i) == '*') {
					R++;
				} else {
					L++;
				}
			}
			System.out.println(L + " " + R);
		}
	}
}
