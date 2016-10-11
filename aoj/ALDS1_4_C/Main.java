import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<String> A = new HashSet<>();
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			String str = sc.next();
			if (S.equals("insert")) {
				A.add(str);
			} else {
				if (A.contains(str)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}
