import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				break;
			}
			System.out.println("Case "+ ++i + ": " + N);	
		}
	}
}
