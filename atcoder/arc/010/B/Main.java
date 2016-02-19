import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] holiday = new int[366];
		for (int i = 0; i < 366; i++) {
			if (i % 7 == 0 || i % 7 == 6) {
				holiday[i] = 1;
			} else {
				holiday[i] = 0;
			}
		}
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			String[] x = S.split("/", 0);
			int month = Integer.parseInt(x[0]);
			int day = Integer.parseInt(x[1]);
			month--;
			day--;
			while (month > 0) {
				switch (month) {
					case 1:
						day += 31;
						break;
					case 2:
						day += 29;
						break;
					case 3:
						day += 31;
						break;
					case 4:
						day += 30;
						break;
					case 5:
						day += 31;
						break;
					case 6:
						day += 30;
						break;
					case 7:
						day += 31;
						break;
					case 8:
						day += 31;
						break;
					case 9:
						day += 30;
						break;
					case 10:
						day += 31;
						break;
					case 11:
						day += 30;
						break;
				}
				month--;
			}
			while (day < 366 && holiday[day] == 1) {
				day++;
			}
			if (day < 366) {
				holiday[day] = 1;
			}
		}
		int ans = 0;
		int ren = 0;
		for (int i = 0; i < 366; i++) {
			if (holiday[i] == 1) {
				ren++;
			} else {
				if (ans < ren) {
					ans = ren;
				}
				ren = 0;
			}
		}
		if (ans < ren) {
			ans = ren;
		}
		System.out.println(ans);
	}
}
