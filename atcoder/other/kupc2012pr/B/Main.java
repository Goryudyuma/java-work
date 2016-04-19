import java.util.*;
import java.math.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		BigInteger a[] = new BigInteger[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextBigInteger();
		}
		Arrays.sort(a);
		for (int i = N - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
