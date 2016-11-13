import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			int count = 0;
			for (int i = 0; i < S.length(); i++) {
				if (count % 2 == 0 && S.charAt(i) == 'I') {
					count++;
				} else if(count % 2 == 1 && S.charAt(i) == 'O') {
					count++;
				}
			}
			if (count != 0) {
				count++;
				count /= 2;
				count *= 2;
				count--;
			}
			System.out.println(count);
		}
	}
}
