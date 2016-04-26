import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for (int i = 0; i < S.length(); i++) {
			System.out.print((char)((S.charAt(i)-'A'+23)%26+'A'));
		}
		System.out.println("");
	}
}
