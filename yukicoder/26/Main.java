import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int p = sc.nextInt(), n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt(), b = sc.nextInt();
				if (a == p) {
					p = b;
				} else if(b == p) {
					p = a;
				}
			}
			System.out.println(p);
		}
	}
}
