import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		int ans = Math.abs(A);
		ans += Math.abs(A - B);
		ans += Math.abs(B);
		System.out.println(ans);
	}
}
