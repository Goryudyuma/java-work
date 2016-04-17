import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		int b = -1;
		int e = N;
		int X = sc.nextInt();
		while (b + 1 < e) {
			int m = (b + e) / 2;
			if (H[m] > X) {
				e = m;
			} else {
				b = m;
			}
		}
		System.out.println(b + 2);
	}
}
