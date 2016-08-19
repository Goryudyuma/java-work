import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] x = new char[20];
		int idx = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'B') {
				idx--;
			} else {
				if (idx < 0) {
					idx = 0;
				}
				x[idx] = s.charAt(i);
				idx++;
			}
		}
		for (int j = 0; j < idx; j++) {
			System.out.print(x[j]);
		}
		System.out.println("");

	}
}
