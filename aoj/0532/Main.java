import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int start = sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
			int stop = sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
			int time = stop - start;
			System.out.println(time / 3600 + " " + time % 3600 / 60 + " " + time % 60);
		}
	}
}
