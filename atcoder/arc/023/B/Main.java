import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int R, C, D;
		R = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		int ans = 0;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				int now = sc.nextInt();
				if (i + j <= D && (i + j) % 2 == D % 2) {
					ans = Math.max(ans, now);	
				}
			}
		}

		System.out.println(ans);

	}
}
