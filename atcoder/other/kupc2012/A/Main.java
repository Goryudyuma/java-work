import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int E = sc.nextInt();
		int min = T - E;
		int max = T + E;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if(min <= max / x * x){
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(-1);
	}
}

