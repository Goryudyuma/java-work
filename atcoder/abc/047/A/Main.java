import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if (a + b == c || b + c == a || c + a == b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
