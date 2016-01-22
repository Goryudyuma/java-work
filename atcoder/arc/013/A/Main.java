import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N,M,L,P,Q,R;
		N = sc.nextInt();
		M = sc.nextInt();
		L = sc.nextInt();
		P = sc.nextInt();
		Q = sc.nextInt();
		R = sc.nextInt();
		int ans = 0;
		ans = Math.max(ans, (N/P) * (M/Q) * (L/R));
		ans = Math.max(ans, (N/Q) * (M/P) * (L/R));
		ans = Math.max(ans, (N/R) * (M/Q) * (L/P));
		ans = Math.max(ans, (N/P) * (M/R) * (L/Q));
		ans = Math.max(ans, (N/Q) * (M/R) * (L/P));
		ans = Math.max(ans, (N/R) * (M/P) * (L/Q));
		System.out.println(ans);
	}
}

