import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNextLine()) {
				int c1, c2, c3;
				try {
					c1 = sc.nextInt();
					c2 = sc.nextInt();
					c3 = sc.nextInt();
				} catch (Exception e) {
					break;
				}
				int A = 0, B = 0;
				for (int i = 1; i <= 10; i++) {
					if (i != c1 && i != c2 && i != c3) {
						if (i + c1 + c2 <= 20) {
							A++;
						} else {
							B++;
						}
					}
				}
				if (A >= B) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
