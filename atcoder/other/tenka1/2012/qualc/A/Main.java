import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] prime = new boolean[n + 100];
		prime[0] = true;
		prime[1] = true;
		int ans = 0;
		for (int i = 2; i < n; i++) {
			if (!prime[i]) {
				ans++;
				int j = 1;
				while (i * ++j < n) {
					prime[i * j] = true;	
				}
			}
		}
		System.out.println(ans);
	}
}

