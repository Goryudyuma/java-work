import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			long N = sc.nextLong(), K = sc.nextLong();
			long ans = K;
			for (int i = 1; i < N; i++) {
				ans *= K - 1;
			}
			System.out.println(ans);
		}
	}
}
