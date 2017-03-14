import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt(), K = sc.nextInt();
			System.out.println(50 * N + (int)(50*N/(0.8+0.2*K)+ 0.01));
		}
	}
}
