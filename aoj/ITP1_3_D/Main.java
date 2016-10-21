import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			int ans = 0;
			for (int i = a; i <= b; i++) {
				if (c % i == 0) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
