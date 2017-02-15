import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			int c = 0, w = 0;
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == 'c') {
					c++;
				} else {
					w++;
				}
			}
			System.out.println(Math.max(0, Math.min(c - 1, w)));
		}
	}
}
