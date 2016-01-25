import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int[] l = new int[L];
		int[] r = new int[R];
		for (int i=0; i<L; i++) {
			l[i] = sc.nextInt();
		}
		for (int i=0; i<R; i++) {
			r[i] = sc.nextInt();
		}
		Arrays.sort(r);
		Arrays.sort(l);
		int i = 0, j = 0, ans = 0;
		while (i<L && j<R) {
			if (l[i] == r[j]) {
				ans++;
				i++;
				j++;
			} else {
				if (l[i] < r[j]) {
					i++;
				} else {
					j++;
				}
			}
		}
		System.out.println(ans);
	}
}
