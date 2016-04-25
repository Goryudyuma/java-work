import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[31];
		for (int i = 0; i < 28; i++) {
			x[sc.nextInt()] = 1;
		}
		for (int i = 1; i <= 30; i++) {
			if (x[i] != 1) {
				System.out.println(i);
			}
		}
	}
}
