import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = "";
		boolean[] x = new boolean[8];
		for (int i = S.length() - 1; i >= 0; i--) {
			if (!x[(int)S.charAt(i) - (int)'A'] ) {
				x[(int)S.charAt(i) - (int)'A'] = true;
				ans = S.charAt(i) + ans;
			}
		}
		for (int i = 0; i < 8; i++) {
			if (!x[i]) {
				ans = (char)(i + (int)'A') + ans;
			}
		}
		System.out.println(ans);
	}
}
