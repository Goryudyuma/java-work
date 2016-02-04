import java.util.*;

class Main {
	private static int[] B = new int[10];
	private static int[] C = new int[10];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			B[i] = sc.nextInt();
			C[B[i]] = i;
		}
		int N;
		N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			A[i] = rechange(A[i]);	
		}
		Arrays.sort(A);
		for (int i = 0; i < N; i++) {
			System.out.println(change(A[i]));
		}
	}

	private static long reverse(long x){
		long ret = 0;
		while (x != 0) {
			ret *= 10;
			ret += x % 10;
			x /= 10;
		}
		return ret;
	}

	private static long change(long x){
		long ret = 0;
		long memo = 0;
		while (x % 10 == 0) {
			x /= 10;
			memo++;
		}
		while (x != 0) {
			ret *= 10;
			ret += B[(int)(x % 10)];
			x /= 10;
		}
		return reverse(ret) * (long)Math.pow(10, memo);
	}
	
	private static long rechange(long x){
		long ret = 0;
		long memo = 0;
		while (x % 10 == 0) {
			x /= 10;
			memo++;
		}
		while (x != 0) {
			ret *= 10;
			ret += C[(int)(x % 10)];
			x /= 10;
		}
		return reverse(ret) * (long)Math.pow(10, memo);
	}

}
