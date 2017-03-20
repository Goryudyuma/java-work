import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] A = new int[N];
			int sum = 0;
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
				sum += A[i];
			}
			int ans = 1 << 29;
			for (int i = 1; i * i <= sum; i++) {
				int count = 0;
				int stock = 0;
				for (int j = 0; j < N; j++) {
					int x;
					if (j >= i) {
						x = i * 2 - j - 1;	
					} else {
						x = j + 1;
					}
					if (x <= 0) {
						x = 0;
					}
					count += Math.abs(A[j] - x);
					stock += A[j] - x;
				}	
				ans = Math.min((count + stock) / 2, ans);
			}
			System.out.println(ans);
		}
	}
}
