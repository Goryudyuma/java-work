import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S = sc.next();
		int x[] = new int[4];
		for (int i = 0; i < n; i++) {
			switch (S.charAt(i)) {
				case '1':x[0]++;break;
				case '2':x[1]++;break;
				case '3':x[2]++;break;
				case '4':x[3]++;break;
			}
		}
		Arrays.sort(x);
		System.out.println(x[3]+" "+x[0]);
	}
}
