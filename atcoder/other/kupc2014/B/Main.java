import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean[] prime = new boolean[1001];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i < 1001; i++) {
			if (!prime[i]) {
				int j = 2;
				while (i * j < 1001) {
					prime[i*j] = true;
					j++;
				}
			}
		}
		int now = 1;
		int x = 0;
		while (now < 1001 && x < 1001) {
			while (++x < 1001 && prime[x]) ;
			String S = new String("Y");
			while (S.equals("Y")) {
				now *= x;
				if (now > 1000) {
					break;
				}
				System.out.printf("? %d\n", now);
				System.out.flush();
				S = sc.next();
			}
			now /= x;
		}
		System.out.printf("! %d\n", now);
	}
}
