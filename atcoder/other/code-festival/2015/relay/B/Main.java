import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] p = new String[10];
		for (int i = 0; i < 10; i++) {
			p[i] = sc.next();
		}
		boolean ans = true;
		for (int i = 0; i < 10; i++) {
			boolean flag = false;
			for (int j = 0; j < 10; j++) {
				if(p[j].charAt(i) == 'o'){
					flag = true;
					break;
				}
			}
			if (flag == false) {
				ans = false;
				break;
			}
		}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
