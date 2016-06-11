import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] prime = new int[10001];
		prime[0] = prime[1] = 1;
		for (int i = 2; i < 10001; i++) {
			if (prime[i] == 0) {
				int j = 2;
				while (i * j < 10001) {
					prime[i * j] = 1;
					j++;
				}
			}
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			while (true) {
				if (prime[N] == 0 && prime[N - 2] == 0) {
					System.out.println(N-2 + " " + N);
					break;
				}
				N--;
			}
		}
	}
}
