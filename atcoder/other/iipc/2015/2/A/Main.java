import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N==45) {
			System.out.println(1);
			return;
		}
		int i = 1;
		while (i * N % 90 != 0) {
			i++;
		}
		System.out.println(i);
	}
}
