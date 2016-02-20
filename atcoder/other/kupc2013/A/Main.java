import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String ans = new String("kogakubu10gokan");
		for (int i = 0; i < N; i++) {
			int year = sc.nextInt();
			String name = sc.next();
			if (Q >= year) {
				ans = name;
			}
		}
		System.out.println(ans);
	}
}
