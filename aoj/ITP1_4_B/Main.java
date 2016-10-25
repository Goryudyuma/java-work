import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			double N = sc.nextDouble();
			System.out.printf("%.10f %.10f\n", N * N * Math.PI, 2. * N * Math.PI);
		}
	}
}
