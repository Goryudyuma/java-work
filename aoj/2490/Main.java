import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		for (int i = 0; i < n; i++) {
			if (sc.next().equals("(")) {
				m += sc.nextInt();
			} else {
				m -= sc.nextInt();
				if (m < 0) {
					System.out.println("NO");
					return;
				}
			}
		}
		if (m == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
