import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		for (int i = 0; i < 2; i++) {
			int a = sc.nextInt();
			if (a==x||a==y) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		return;
	}
}
