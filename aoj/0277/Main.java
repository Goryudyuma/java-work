import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[5];
		x[1] = 6000;
		x[2] = 4000;
		x[3] = 3000;
		x[4] = 2000;
		for (int i = 0; i < 4; i++) {
			System.out.println(x[sc.nextInt()] * sc.nextInt());
		}

	}
}
