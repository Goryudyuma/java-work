import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt(), E = sc.nextInt();
		System.out.println(A - Math.max((B - 1) / D + 1, (C - 1) / E + 1));
	}
}
