import java.util.*;

class Main {
	public static void main(String args[]) {
		new Thread(null, () -> {
			try(Scanner sc = new Scanner(System.in)){
				boolean[] prime = new boolean[100000005];
				prime[0] = true; prime[1] = true;
				for (int i = 2; i <= Math.sqrt(100000005); i++) {
					if (!prime[i]) {
						int j = 2;
						while (i * j < 100000005) {
							prime[i*j] = true;
							j++;
						}
					}
				}
				int N = sc.nextInt();
				int ans = 0;
				for (int i = 0; i < N; i++) {
					if (!prime[sc.nextInt()]) {
						ans++;
					}
				}
				System.out.println(ans);
			}
		}, "", 1<<24).start();
	}
}
