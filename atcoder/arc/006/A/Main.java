import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] E = new int[6];
		int B;
		int[] L = new int[6];
		for (int i = 0; i<6; i++) {
			E[i] = sc.nextInt();
		}
		B = sc.nextInt();
		for (int i = 0; i<6; i++) {
			L[i] = sc.nextInt();
		}
		int i = 0, j = 0;
		int num = 0;
		while (i<6 && j<6) {
			if (E[i]==L[j]) {
				num++;
				i++;
				j++;
			} else if (E[i] < L[j]){
				i++;
			} else {
				j++;
			}
		}
		if (num == 6) {
			System.out.println(1);
		} else if(num == 5) {
			for (int k = 0; k < 6; k++) {
				boolean f = true;
				for (int l = 0; l < 6; l++) {
					if (L[k] == E[l]) {
						f = false;
						break;
					}
				}
				if (f) {
					i = k;
					break;
				}
			}	
			if (L[i] == B) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		} else if(num == 4) {
			System.out.println(4);
		} else if(num == 3) {
			System.out.println(5);
		} else {
			System.out.println(0);
		}
	}
}

