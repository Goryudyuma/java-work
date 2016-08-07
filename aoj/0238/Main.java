import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int T = sc.nextInt();
			if (T==0) {
				break;
			}
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				T += (sc.nextInt() - sc.nextInt());
			}
			if (T <= 0) {
				System.out.println("OK");
			}else{
				System.out.println(T);
			}
		}
	}
}
