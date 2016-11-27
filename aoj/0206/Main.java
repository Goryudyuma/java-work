import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				long L = sc.nextLong();
				if (L == 0) {
					break;
				}
				long i, j=-1;
				for (i = 0; i < 12; i++) {
					L -= sc.nextLong();
					L += sc.nextLong();
					if (L <= 0 && j == -1) {
						j=i;
					}
				}
				if (j == -1) {
					System.out.println("NA");
				} else {
					System.out.println(j + 1);
				}
			}
		}
	}
}
