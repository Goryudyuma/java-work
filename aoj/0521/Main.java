import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int now = 1000 - sc.nextInt();
			if (now == 1000) {
				break;
			}	
			int ans = 0;
			for (int i = 2; i >= 0; i--) {
				for (int j = 1; j >= 0; j--) {
					int coin = (int)(Math.pow(10, i) * (j * 4.0 + 1.0));
					ans += now / coin;
					now %= coin;
				}
			}
			System.out.println(ans);
		}
	}
}
