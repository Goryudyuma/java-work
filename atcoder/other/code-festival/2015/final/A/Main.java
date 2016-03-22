import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String U = sc.next();
		if (S.length() == 5 && T.length() == 7 && U.length() == 5) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
}
