import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int a = 0,b = 0;
		for (int i = 0; i < N.length(); i++) {
			if (i % 2 == 0) {
				a += Character.getNumericValue(N.charAt(i));	
			} else {
				b += Character.getNumericValue(N.charAt(i));	
			}
		}
		if (N.length() % 2 == 1) {
			System.out.printf("%d %d\n",b,a);
		} else {
			System.out.printf("%d %d\n",a,b);
		}
	}
}
