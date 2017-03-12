import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int E = 0, W = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'O') {
				E++;
				W=0;
				if (E >= 3) {
					System.out.println("East");
					return;
				}
			} else {
				W++;
				E=0;
				if (W >= 3) {
					System.out.println("West");
					return;
				}
			}
		}
		System.out.println("NA");
	}
}
