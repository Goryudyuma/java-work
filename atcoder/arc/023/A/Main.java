import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		System.out.println(day(2014, 5, 17) - day(y, m, d));
	}
	private static int day(int y, int m, int d){
		return (365 * y + (int)(y / 4) - (int)(y / 100) + (int)(y / 400) + (int)(306 * (m + 1) / 10) + d - 429);
	}
}
