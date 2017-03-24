import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == '?') {
					System.out.println("yukicoder".charAt(i));
				}
			}
		}
	}
}
