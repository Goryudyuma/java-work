import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] xx = new char[10];
		xx[2]='k';
		xx[3]='s';
		xx[4]='t';
		xx[5]='n';
		xx[6]='h';
		xx[7]='m';
		xx[8]='y';
		xx[9]='r';
		xx[0]='w';

		for (int i = 0; i < input.length(); i+=2) {
			int num = Character.getNumericValue(input.charAt(i));
			if (num != 1 && num != 0) {
				System.out.print(xx[num]);
			} else if(num == 0) {
				if (input.charAt(i + 1) == 'U') {
					System.out.print("nn");
				} else {
					System.out.print('w');
					if (input.charAt(i + 1) == 'D') {
						System.out.print('o');
					} else {
						System.out.print('a');
					}
				}
				continue;
			}
			if (input.charAt(i + 1) == 'T' ) {
				System.out.print('a');
			}
			if (input.charAt(i + 1) == 'L' ) {
				System.out.print('i');
			}
			if (input.charAt(i + 1) == 'U' ) {
				System.out.print('u');
			}
			if (input.charAt(i + 1) == 'R' ) {
				System.out.print('e');
			}
			if (input.charAt(i + 1) == 'D' ) {
				System.out.print('o');
			}
		}
		System.out.println("");
	}
}
