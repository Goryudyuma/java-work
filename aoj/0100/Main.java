import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt(), count = 0;
			if (N == 0) {
				break;
			}
			long A[] = new long[4001];
			for (int i = 0; i < N; i++) {
				int e = sc.nextInt();
				long p = sc.nextLong(), q = sc.nextLong();
				A[e] += p * q;
				if (A[e] >= 1000000) {
					System.out.println(e);
					count++;
					A[e] = Long.MIN_VALUE;
				}
			}
			if (count == 0) {
				System.out.println("NA");
			}
		}
	}
}
