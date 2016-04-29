import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = 5000, b = 5000;
		for (int i = 0; i < 3; i++) {
			a = Math.min(a, sc.nextInt());
		}
		for (int i = 0; i < 2; i++) {
			b = Math.min(b, sc.nextInt());
		}
		System.out.println(a + b - 50);


	}
}
