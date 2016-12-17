import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong();
			System.out.println(Math.max(a + b - n, 0));
		}
	}
}
