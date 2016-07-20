import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] S = new String[3];
			S[0] = sc.next();
			if (S[0].equals("0")) {
				break;
			}
			S[1] = sc.next();
			S[2] = sc.next();
			boolean f = true;
			for (int i = 0; i < 3; i++) {
				if (S[i].charAt(0) == S[i].charAt(1) && S[i].charAt(1) == S[i].charAt(2) && S[i].charAt(0) != '+') {
					System.out.println(S[i].charAt(0));
					f=false;
					break;
				}
				if (S[0].charAt(i) == S[1].charAt(i) && S[1].charAt(i) == S[2].charAt(i) && S[0].charAt(i) != '+') {
					System.out.println(S[0].charAt(i));
					f=false;
					break;
				}
			}
			if (f && S[0].charAt(0) == S[1].charAt(1) && S[1].charAt(1) == S[2].charAt(2) && S[0].charAt(0) != '+') {
				System.out.println(S[0].charAt(0));
				f=false;
			}
			if (f && S[0].charAt(2) == S[1].charAt(1) && S[1].charAt(1) == S[2].charAt(0) && S[0].charAt(2) != '+') {
				System.out.println(S[0].charAt(2));
				f=false;
			}
			if (f) {
				System.out.println("NA");
			}
		}
	}
}
