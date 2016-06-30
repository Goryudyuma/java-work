import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int D = sc.nextInt(), E = sc.nextInt();
			if (D == 0 && E == 0) {
				break;
			}
			double ans = 1 << 29;
			for (int i = 0; i < D / 2 + 1; i++) {
				double num = Math.abs(Math.sqrt(i * i + (D - i) * (D - i)) - E);
				if (num < ans) {
					ans = num;	
				}
			}
			System.out.println(ans);
		}
	}
}
