import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int N = sc.nextInt();
		System.out.printf("%d %d %d\n",Math.max(N - a, 0), Math.max(N * 2 - b, 0), Math.max(N * 3 - c, 0));
	}
}
