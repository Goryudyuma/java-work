import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int maxnum = 0;
			int id = 0;
			for (int i = 0; i < 5; i++) {
				int now = sc.nextInt() + sc.nextInt();
				if (now == 0) {
					return;
				}
				if (now > maxnum) {
					maxnum = now;
					id = i;
				}
			}
			System.out.println((char)('A' + id) + " " + maxnum);
		}
	}
}
