import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (sc.nextLong() % 2 == 1) {
					count++;
				}
			}
			if (count % 2 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
