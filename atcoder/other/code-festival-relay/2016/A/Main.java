import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			double R1 = sc.nextDouble(), R2 = sc.nextDouble();
			System.out.println(R1 * R2 / (R1 + R2));
		}
	}
}
