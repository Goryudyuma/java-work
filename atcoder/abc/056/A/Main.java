import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			char A = sc.next().charAt(0), B = sc.next().charAt(0);
			if (A == 'H' && B == 'H') {
				System.out.println('H');
			} else 
			if (A == 'D' && B == 'H') {
				System.out.println('D');
			} else 
			if (A == 'D' && B == 'D') {
				System.out.println('H');
			} else {
				System.out.println('D');
			} 
		}
	}
}
