import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String T = sc.next();
			long ans = 0;
			for (int i = 0; i < T.length() - ans; i++) {
				long memo = 0;
				int k = i;
				for (int j = 0; i + j < T.length(); j++) {
					if (j % 2 == 0) {
						if (T.charAt(i + j) == '2' || T.charAt(i + j) == '?') {
							if (T.charAt(i + j) == '2') {
								k = i + j;		
							}
							memo++;	
						} else {
							break;
						}
					} else {
						if (T.charAt(i + j) == '5' || T.charAt(i + j) == '?') {
							if (T.charAt(i + j) == '5') {
								k = i + j;		
							}
							memo++;	
						} else {
							if (T.charAt(i + j) != '2') {
								k = i + j;
							}
							break;
						}
					}
				}
				i = k;
				ans = Math.max(ans, memo / 2 * 2);
			}
			System.out.println(ans);
		}
	}
}
