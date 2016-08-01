import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (0 < a) {
			System.out.println("Positive");
		} else {
			if (0 < b) {
				System.out.println("Zero");
			} else {
				if ((a - b) % 2 != 0 ) {
					System.out.println("Positive");
				} else {
					System.out.println("Negative");
				}
			}
		}
	}
}
