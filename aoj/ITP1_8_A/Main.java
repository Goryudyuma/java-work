import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.nextLine();
			for (int i = 0; i < S.length(); i++) {
				if (Character.isUpperCase(S.charAt(i))) {
					System.out.print(Character.toLowerCase(S.charAt(i)));
				} else {
					System.out.print(Character.toUpperCase(S.charAt(i)));
				}
			}
			System.out.println("");
		}
	}
}
