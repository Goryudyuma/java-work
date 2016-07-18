import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		for (int zz = 0; zz < z; zz++) {
			int xmin = sc.nextInt(), ymin = sc.nextInt();
			int xmax = sc.nextInt() + xmin, ymax = sc.nextInt() + ymin;
			int N = sc.nextInt();
			int ans = 0;
			for (int i = 0; i < N; i++) {
				int x = sc.nextInt(), y = sc.nextInt();
				if (xmin <= x && x <= xmax && ymin <= y && y <= ymax) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
