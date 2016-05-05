import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		for (int i = 0; i < 4; i++) {
			num += sc.nextInt();
		}
		System.out.println(num / 60);
		System.out.println(num % 60);
	}
}
