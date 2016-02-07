import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N, sum = 0;
		N = sc.nextInt();
		int[] D = new int[3];
		for (int i = 0; i < 3; i++) {
			D[i] = sc.nextInt();
			sum += D[i];
		}
		Arrays.sort(D);
		int ans = 0;
		ans += ((int)(N / sum)) * 3;
		N %= sum;
		int j = 2;
		while (N > 0) {
			N -= D[j];
			j--;
		}
		System.out.println(ans + 2 - j);
	}
}
