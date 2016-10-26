import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int a, b;
			char c;
			while (true) {
				a = sc.nextInt();
				c = sc.next().charAt(0);
				b = sc.nextInt();
				switch (c) {
					case '?':
						return;
					case '+':
						System.out.println(a + b);break;
					case '-':
						System.out.println(a - b);break;
					case '*':
						System.out.println(a * b);break;
					case '/':
						System.out.println(a/b);break;
				}
			}
		}
	}
}
