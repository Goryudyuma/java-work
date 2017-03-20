import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			boolean[] f = new boolean[N];
			for (int i = 0; i < N; i++) {
				f[i] = true;
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					String S = sc.next();
					if (!(S.equals("-") || S.equals("nyanpass"))) {
						f[j] = false;
					}
				}
			}
			int c = 0;
			for (int i = 0; i < N; i++) {
				if (f[i]) {
					c++;
				}
			}
			if (c != 1) {
				System.out.println(-1);
			} else {
				for (int i = 0; i < N; i++) {
					if (f[i]) {
						System.out.println(i + 1);
					}
				}
			}
		}
	}
}
