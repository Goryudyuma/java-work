import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			long k = sc.nextInt();
			StringBuffer S = new StringBuffer(sc.next());
			for (int i = 0; i < S.length() - 1 && k != 0; i++) {
				if (S.charAt(i) == 's' && S.charAt(i + 1) < 's') {
					S.deleteCharAt(i);
					i-=2;
					if (i==-2) {
						i=-1;
					}
					k--;
				}
			}
			for (int i = S.length() - 1; i >= 0 && k != 0; i--) {
				if (S.charAt(i) == 's') {
					S.deleteCharAt(i);
					k--;
				}
			}
			System.out.println(S);
		}
	}
}
