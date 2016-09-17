import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(calc(sc.nextInt(), sc.nextInt()));
	}
	public static int calc(int a, int b) {
		if (a < b) {
			return calc(b, a);
		}
		if (b == 0) {
			return a;	
		}
		return calc(b, a % b);
	}
}
