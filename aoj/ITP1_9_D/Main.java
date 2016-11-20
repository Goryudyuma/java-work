import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			StringBuilder S = new StringBuilder(sc.next());
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				String operator = sc.next();
					int a = sc.nextInt(), b = sc.nextInt() + 1;
				if (operator.equals("print")) {
					System.out.println(S.substring(a, b));
				} else if(operator.equals("reverse")) {
					S.replace(a, b, (new StringBuilder(S.substring(a, b))).reverse().toString());
				} else {
					String x = sc.next();
					S.replace(a, b, x);
				}
			}
		}
	}
}
