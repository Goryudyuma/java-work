import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String SS = sc.next();
		int N = 0, W = 0, S = 0, E = 0;
		for (int i = 0; i < SS.length(); i++) {
			switch (SS.charAt(i)) {
				case 'N' : {N++;break;}
				case 'W' : {W++;break;}
				case 'S' : {S++;break;}
				case 'E' : {E++;break;}
			}
		}
		if ((N == 0 && S == 0 || N != 0 && S != 0) && (W == 0 && E == 0 || W != 0 && E != 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
