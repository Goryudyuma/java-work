import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next().toUpperCase();
			int ans = 0;
			while (true) {
				String T = sc.next();
				if(T.equals("END_OF_TEXT"))break;

				if (S.equals(T.toUpperCase())) {
					ans++;
				}  		
			}
			System.out.println(ans);
		}
	}
}
