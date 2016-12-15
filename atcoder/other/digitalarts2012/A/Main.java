import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] S = sc.nextLine().split(" ", -1);
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				String X = sc.next();
				for (int j = 0; j < S.length; j++) {
					if (S[j].length() == X.length()) {
						boolean f = true;
						for (int k = 0; k < X.length(); k++) {
							if (X.charAt(k) != '*' && S[j].charAt(k) != X.charAt(k)) {
								f = false;
							}
						}
						if (f) {
							S[j] = new String(new char[X.length()]).replace("\0","*");
						}
					}
				}
			}
			for (int i = 0; i < S.length; i++) {
				System.out.print(S[i]);
				if (i == S.length - 1) {
					System.out.println("");
				} else {
					System.out.print(" ");
				}
			}
		}
	}
}
