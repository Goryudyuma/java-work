import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (N <= A) {
			System.out.println("Takahashi");
			return;
		}
		if (A == B) {
			if (N % (A + 1) == 0) {
				System.out.println("Aoki");
			} else {
				System.out.println("Takahashi");
			}
			return;
		}
		N--;
		if (N <= B) {
			System.out.println("Aoki");
			return;
		}
		N--;

		N %= Math.min(A, B) + 1;
		if ((N <= A || B < A) && !(A < B) ) {
			System.out.println("Takahashi");
			return;
		}
		N--;
		System.out.println("Aoki");
		return;
	}
}
