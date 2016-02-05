import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int C;
		C = sc.nextInt();
		int[] ans = new int[3];
			int[] size = new int[3];
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < 3; j++) {
				size[j] = sc.nextInt();
			}
			Arrays.sort(size);
			for (int j = 0; j < 3; j++) {
				ans[j] = Math.max(ans[j], size[j]);
			}
		}
		System.out.println(ans[0] * ans[1] * ans[2]);
	}
}
