import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt(), M = sc.nextInt(), Q = sc.nextInt();
			String[] ans = new String[26];
			for (int i = 0; i < 26; i++) {
				ans[i] = "NA";
			}
			for (int i = 0; i < N; i++) {
				String S = sc.next();
				for (int j = 0; j < M; j++) {
					if (S.charAt(j) != '*') {
						ans[(int)S.charAt(j) - (int)'A'] = (i + 1) + " " + (j + 1);
					}
				}
			}
			for (int i = 0; i < Q; i++) {
				System.out.println(ans[(int)sc.next().charAt(0) - (int)'A']);
			}
		}

	}
}
