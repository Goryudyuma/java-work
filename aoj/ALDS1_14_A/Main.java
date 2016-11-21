import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String T = sc.next(), P = sc.next();
			int ans = 0;
			for (int i = 0; i <= T.length() - P.length(); i++) {
				if (T.substring(i, i + P.length()).equals(P)) {
					System.out.println(i);
				}
			}
		}
	}
}
