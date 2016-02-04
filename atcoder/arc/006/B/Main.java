import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N, L;
		N = sc.nextInt();
		L = sc.nextInt();
		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = i + 1;
		}
		String S;
		S = sc.nextLine();
		for (int i = 0; i < L; i++) {
			S = sc.nextLine();
			for (int j = 0; j * 2 + 1 < S.length(); j ++) {
				if (S.charAt(j * 2 + 1) == '-' ) {
					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}
		}
		S = sc.nextLine();
		for (int i = 0; i * 2 < S.length(); i++) {
			if (S.charAt(i * 2) == 'o') {
				System.out.println(data[i]);
				return;
			}
		}
	}
}
