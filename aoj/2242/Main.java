import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt(), Q = sc.nextInt();
			if (N == 0 && Q == 0) {
				break;
			}
			String[] SS = new String[N];
			int[] base = new int[N];
			int[] now = new int[N];
			for (int i = 0; i < N; i++) {
				SS[i] = sc.next();
				base[i] = sc.nextInt();
				now[i] = sc.nextInt();
			}
			for (int i = 0; i < Q; i++) {
				int num = sc.nextInt();
				boolean f = true;
				for (int j = 0; j < N; j++) {
					if (now[j] - base[j] < num && num <= now[j]) {
						System.out.println(SS[j] + " " + ( num - now[j] + base[j]));
						f = false;
						break;
					}
				}
				if (f) {
					System.out.println("Unknown");
				}
			}
		}
	}
}
