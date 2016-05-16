import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int n = sc.nextInt(), ans = 0;
		for (int i = 0; i < n; i++) {
			String Input = sc.next();
			Input += Input;
			if (Input.indexOf(S) != -1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
