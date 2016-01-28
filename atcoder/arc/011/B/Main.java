import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		String ans = new String();
		for (int i = 0; i < N; i++) {
			String W_ = sc.next();
			String S = new String();
			char[] W = W_.toLowerCase().toCharArray();
			for (int j = 0; j < W_.length(); j++) {
				if (W[j] == 'b' || W[j] == 'c') {
					S += "1";
				} else if (W[j] == 'd' || W[j] == 'w') {
					S += "2";
				} else if (W[j] == 't' || W[j] == 'j') {
					S += "3";
				} else if (W[j] == 'f' || W[j] == 'q') {
					S += "4";
				} else if (W[j] == 'l' || W[j] == 'v') {
					S += "5";
				} else if (W[j] == 's' || W[j] == 'x') {
					S += "6";
				} else if (W[j] == 'p' || W[j] == 'm') {
					S += "7";
				} else if (W[j] == 'h' || W[j] == 'k') {
					S += "8";
				} else if (W[j] == 'n' || W[j] == 'g') {
					S += "9";
				} else if (W[j] == 'z' || W[j] == 'r') {
					S += "0";
				} 
			}
			if (S.length() != 0) {
				if (ans.length() != 0) {
					ans += " ";
				}
				ans += S;
			}
		}
		System.out.println(ans);
	}
}
