import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			Integer N = sc.nextInt();
			Integer K = sc.nextInt();
			if (N == 0 && K == 0) {
				break;
			}
			Integer[] a = new Integer[N];

			Long ans = Long.MIN_VALUE;
			for (Integer i = 0; i < N; i++) {
				a[i] = sc.nextInt();
				if (i != 0) {
					a[i] += a[i-1];
				}
				if (i >= K) {
					ans = Math.max(a[i] - a[i - K], ans);	
				}
			}
			System.out.println(ans);
		}
	}
}
