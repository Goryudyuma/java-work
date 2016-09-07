import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		if (A*B*C%2==0) {
			System.out.println(0);
		} else {
			System.out.println(Math.min(A*B,Math.min(B*C,A*C)));
		}
	}
}
