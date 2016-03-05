import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A < 0 && B > 0) {
			System.out.println(B - A - 1);
		} else {
			System.out.println(B - A);
		}
	}
}
