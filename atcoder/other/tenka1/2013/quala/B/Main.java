import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N, ans = 0;
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int sum = 0, input;
			for (int j = 0; j < 5; j++) {
				input = sc.nextInt();
				sum += input;
			}
			if (sum < 20) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
