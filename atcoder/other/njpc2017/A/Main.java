import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int L = sc.nextInt();
			String S = sc.next();
			for (int i = 0; i < Math.min(L, S.length()); i++) {
				System.out.print(S.charAt(i));
			}
			System.out.println("");
		}
	}
}
