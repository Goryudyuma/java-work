import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = Math.toRadians(sc.nextDouble());
			System.out.println(a * b * Math.sin(c) / 2.);
			System.out.println((a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(c))));
			System.out.println(b * Math.sin(c));
		}
	}
}
