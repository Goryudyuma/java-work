import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ans = 0;
		for (int i = 0; i < S.length() / 2; i++) {
			if(S.charAt(i) == 'i' || S.charAt(i) == 'w'){
				if (S.charAt(i) != S.charAt(S.length() - i - 1)) {
					ans++;
				}
			} else {
				if (S.charAt(i) == '(' && S.charAt(S.length() - i - 1) != ')') {
					ans++;
				} else if (S.charAt(i) == ')' && S.charAt(S.length() - i - 1) != '(') {
					ans++;
				}	
			}
		}
		if (S.length() % 2 == 1 &&(S.charAt(S.length() / 2) == '(' || S.charAt(S.length() / 2) == ')')) {
			ans++;	
		}
		System.out.println(ans);
	}
}
