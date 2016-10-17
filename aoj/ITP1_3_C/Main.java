import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int x = sc.nextInt(), y = sc.nextInt();
				if (x == 0 && y == 0) {
					break;
				}
				System.out.println(Math.min(x,y) + " " + Math.max(x,y));
			}
		}
	}
}
