import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int b = sc.nextInt(), r = sc.nextInt(), g = sc.nextInt();
				int c = sc.nextInt(), s = sc.nextInt(), t = sc.nextInt();
				if (b + r + g + c + s + t == 0) {
					break;
				}
				System.out.println(100 -(t - s - b * 5 - r * 3) * 3 - b * 5 * 2 - r * 3 * 2 + b * 15 + r * 15 + (b * 5 + r * 3) * 15 + g * 7 + c * 2);
			}
		}
	}
}
