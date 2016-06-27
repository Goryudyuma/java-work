import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ht = sc.nextInt();
		int mt = sc.nextInt();
		int hn = sc.nextInt();
		int mn = sc.nextInt();
		int sect = time(ht, mt);
		int secn = time(hn, mn);
		if (sect>=secn || check(sect,secn)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
	private static int time(int a, int b) {
		return a * 60 + b;
	}
	private static boolean check(int a, int b){
		for (int i = b; i < time(12, 0); i++) {
			if(reverse(i) <= a) {
				return true;
			}
		}
		return false;
	}
	private static int reverse(int t) {
		int h = t / 60;
		int m = t % 60;
		return time(((h + 6) % 12), ((m + 30) % 60));
	}

}
