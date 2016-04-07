import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int[] num = new int[4];
		for (int i = 0; i < S.length(); i++) {
			switch (S.charAt(i)) {
				case 'K':num[0]++;break;
				case 'U':num[1]++;break;
				case 'P':num[2]++;break;
				case 'C':num[3]++;break;
			}
		}
		int ans = 1 << 30;
		for (int i = 0; i < 4; i++) {
			ans = Math.min(num[i], ans);
		}
		System.out.println(ans);
	}
}
