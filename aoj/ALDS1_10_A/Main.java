import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long[] L = new long[45];
		L[0] = 1;
		L[1] = 1;
		for (int i = 2; i < 45; i++) {
			L[i] = L[i - 1] + L[i - 2];
		}
		System.out.println(L[sc.nextInt()]);
	}
}
