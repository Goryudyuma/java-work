import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			double R = sc.nextDouble(), C = sc.nextDouble();
			int ans = 0;
			for (int i = 1; i <= R / C; i++) {
				double len = Math.sqrt(R * R - C * C * i * i);
				ans += len / C;
			}
			System.out.println(ans * 4);
		}
	}
}
