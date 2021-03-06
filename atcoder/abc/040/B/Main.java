import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int ans = 1 << 29;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			ans=Math.min(ans, Math.abs((n/i)-i)+n-(n/i)*i);
		}
		System.out.println(ans);
	}
}
