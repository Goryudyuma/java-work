import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count[] = new int[6];
		for (int i = 0; i < N; i++) {
			double len = sc.nextDouble();
			len -= 160.0;
			len /= 5;
			int lenint = (int)len;
			if (lenint < 0) {
				lenint = 0;
			}
			if (lenint > 5) {
				lenint = 5;
			}
			count[lenint]++;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(i + 1 + ":");
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
