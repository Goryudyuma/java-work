import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int W = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
			System.out.println(Math.max(Math.abs(b-a)-W, 0));
		}
	}
}
