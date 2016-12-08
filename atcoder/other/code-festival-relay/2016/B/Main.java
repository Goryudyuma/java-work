import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			boolean f = true;
			for (int i = 0; i <= (S.length()-1) / 2; i++) {
				switch (S.charAt(i)) {
					case 'b':{
						if (S.charAt(S.length() - i - 1) != 'd') {
							f = false;
						}
						break;
					}	
					case 'd':{
						if (S.charAt(S.length() - i - 1) != 'b') {
							f = false;
						}
						break;
					}	
					case 'q':{
						if (S.charAt(S.length() - i - 1) != 'p') {
							f = false;
						}
						break;
					}	
					case 'p':{
						if (S.charAt(S.length() - i - 1) != 'q') {
							f = false;
						}
						break;
					}	
				}
			}
			if (f) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
