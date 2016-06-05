import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				System.out.println(0);
				continue;
			} else if (N == -1) {
				return;
			}
			int ans[] = new int[100];
			int i = 0;
			while (N != 0) {
				ans[i] = N % 4;
				N /= 4;
				i++;
			}
			i--;
			for (; i>=0; i--) {
				System.out.print(ans[i]);
			}
			System.out.println("");
		}
	}
}
