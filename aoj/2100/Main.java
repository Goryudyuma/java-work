import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			int ansA = 0, ansB = 0;
			for (int j = 1; j < N; j++) {
				int Y = sc.nextInt();
				ansA = Math.max(Y - X, ansA);
				ansB = Math.max(X - Y, ansB);
				X = Y;
			}
			System.out.println(ansA + " " + ansB);
		}
	}
}
