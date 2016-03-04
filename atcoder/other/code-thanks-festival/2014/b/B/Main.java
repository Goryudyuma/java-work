import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		System.out.println(Math.max(Math.max(A * B * C, A * B + C), Math.max((A + B) * C, A + B + C)));
	}
}
