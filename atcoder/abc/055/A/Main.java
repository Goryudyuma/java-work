import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			System.out.println(N * 800 - N / 15 * 200);
		}
	}
}
