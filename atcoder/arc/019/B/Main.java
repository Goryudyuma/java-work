import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int diff = 0;
		for (int i = 0; i < S.length() / 2; i++) {
			if (S.charAt(i) != S.charAt(S.length() - i - 1)) {
				diff++;
			}
		}

		if (diff == 0) {
			System.out.println(S.length() / 2 * 50);
		} else if (diff == 1) {
			System.out.println(S.length() * 25 - 2);
		} else {
			System.out.println(S.length() * 25);
		}
	}
}
