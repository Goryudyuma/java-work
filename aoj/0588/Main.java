import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (true) {
			sc.nextLine();
			String c = sc.nextLine();
			if (c.equals("=")) {
				System.out.println(N);
				break;
			} else if (c.equals("+")) {
				N += sc.nextInt();
			} else if (c.equals("-")) {
				N -= sc.nextInt();
			} else if (c.equals("*")) {
				N *= sc.nextInt();
			} else if (c.equals("/")) {
				N /= sc.nextInt();
			}
		}
	}
}
