import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			for (int i = 0; i < S.length(); i++) {
				if (i == 5 || i == 13) {
					System.out.print(" ");
				} else {
					System.out.print(S.charAt(i));
				}
			}
			System.out.println("");
		}
	}
}
