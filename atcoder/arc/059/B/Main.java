import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			for (int i = 0; i < S.length() - 1; i++) {
				if (S.charAt(i) == S.charAt(i + 1)) {
					System.out.println((i + 1) + " " + (i + 2));
					return;
				}
			}
			for (int i = 0; i < S.length() - 2; i++) {
				if (S.charAt(i) == S.charAt(i + 2)) {
					System.out.println((i + 1) + " " + (i + 3));
					return;
				}
			}
			System.out.println("-1 -1");
		}
	}
}
