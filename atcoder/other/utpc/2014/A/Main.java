import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)){
			String[] S = sc.nextLine().split(" ");
			for (int i = 0; i < S.length - 2; i++) {
				if (S[i].equals("not") && S[i+1].equals("not") && !S[i+2].equals("not")) {
					S[i] = "";
					S[i+1] = "";
					i = -1;
				}
			}
			for (int i = 0; i < S.length; i++) {
				if (S[i].equals("")) {
					continue;
				}
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
