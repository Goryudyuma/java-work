import java.util.*;

class Main {
	public static void main(String args[]) {
		int[] ans = new int[26];
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNextLine()) {
				String S = sc.nextLine();
				for (int i = 0; i < S.length(); i++) {
					if (0 <= S.charAt(i) - 'a' && S.charAt(i) - 'a' < 26) {
						ans[S.charAt(i) - 'a']++;
					} else if (0 <= S.charAt(i) - 'A' && S.charAt(i) - 'A' < 26) {
						ans[S.charAt(i) - 'A']++;
					}
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c : %d\n", i + 'a', ans[i]);
		}
	}
}
