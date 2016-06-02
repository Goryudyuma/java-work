import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			int ans[] = new int[7];
			for (int i = 0; i < N; i++) {
				int age = Math.min(6,sc.nextInt() / 10);
				ans[age]++;
			}
			for (int i = 0; i < 7; i++) {
				System.out.println(ans[i]);
			}
		}
	}
}
