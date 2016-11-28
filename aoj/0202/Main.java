import java.util.*;

class Main {
	public static void main(String args[]) {
		boolean[] prime = new boolean[1000001];
		prime[0] = true;
		prime[1] = true;
		for (int i = 0; i < 1000001; i++) {
			if (!prime[i]) {
				int j = 2;
				while (i * j < 1000001) {
					prime[i * j] = true;
					j++;
				}
			}
		}
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				long n = sc.nextLong(), x = sc.nextLong();
				if (n == 0 && x == 0) {
					break;
				}
				long ans = -1;
				boolean[] vs = new boolean[(int)x + 1];
				vs[0] = true;
				for (long i = 0; i < n; i++) {
					long v = sc.nextLong();
					for (long j = 0; j <= x - v; j++) {
						if (vs[(int)j]) {
							vs[(int)(j + v)] = true;
							if (!prime[(int)(j + v)]) {
								ans = Math.max(j + v, ans);
							}
						}
					}
				}
				if (ans == -1) {
					System.out.println("NA");
				} else {
					System.out.println(ans);
				}
			}
		}
	}
}
