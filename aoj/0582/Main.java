import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = 0, m = 0, o = 0;
		while (true) {
			int L[] = new int[3];
			for (int i = 0; i < 3; i++) {
				L[i] = sc.nextInt();
			}
			Arrays.sort(L);
			if (L[0] + L[1] <= L[2]) {
				System.out.println(n + m + o + " " + n + " " + m + " " + o);
				break;
			} else if (L[0] * L[0] + L[1] * L[1] == L[2] * L[2]) {
				n++;
			} else if (L[0] * L[0] + L[1] * L[1] > L[2] * L[2]) {
				m++;
			} else if (L[0] * L[0] + L[1] * L[1] < L[2] * L[2]) {
				o++;
			}

		}
	}
}
