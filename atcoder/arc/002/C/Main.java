import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String S = sc.next();
		char[] cs = {'A', 'B', 'X', 'Y'};
		int ans = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int a = 0; a < 4; a++) {
					for (int b = 0; b < 4; b++) {
						String T = S;
						int count = 0;
						for (int k = 0; k < T.length() - 1; k++) {
							if ((T.charAt(k) == cs[i] && T.charAt(k+1) == cs[j]) || (T.charAt(k) == cs[a] && T.charAt(k+1) == cs[b]) ) {
								k++;
								count++;
							}
						}
						ans = Math.max(ans, count);

					}
				}
			}
		}
		System.out.println(S.length() - ans);
	}
}
