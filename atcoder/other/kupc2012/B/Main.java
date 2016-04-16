import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		if (c.charAt(0) == 'x' && c.charAt(c.length() - 1) == 'x') {
			System.out.println('x');
		} else {
			System.out.println('o');
		}
	}
}
