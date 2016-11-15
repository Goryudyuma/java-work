import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int a, b, c;
				try {
					a = sc.nextInt();
					b = sc.nextInt();
					c = sc.nextInt();
				} catch (Exception e) {
					break;
				}
				a %= b;
				int ans = 0;
				for (int i = 0; i < c; i++) {
					a *= 10;
					ans += a / b;
					a %= b;
				}
				System.out.println(ans);
			}
		}
	}
}
