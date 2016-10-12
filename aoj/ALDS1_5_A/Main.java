import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			boolean[] Q = new boolean[2001];
			Q[0] = true;
			for (int i = 0; i < N; i++) {
				int q = sc.nextInt();
				for (int j = 2000-q; j >= 0; j--) {
					if (Q[j]) {
						Q[j+q] = true;
					}
				}
			}
			int A = sc.nextInt();
			for (int i = 0; i < A; i++) {
				if (Q[sc.nextInt()]) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}
