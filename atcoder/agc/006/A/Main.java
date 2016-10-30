import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			String A = sc.next();
			String B = sc.next();
			for (int i = 0; i <= N; i++) {
				boolean f = true;
				for (int j = i; j < N; j++) {
					if (A.charAt(j) != B.charAt(j - i)) {
						f = false;
					}	
				}
				if (f) {
					System.out.println(i + N);
					return;
				}
			}
		}
	}
}
