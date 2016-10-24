import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.printf("%d %d %f\n", a / b, a % b, (double)a / (double)b);
		}
	}
}
