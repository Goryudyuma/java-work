import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, c;
		n = sc.nextInt();
		c = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[11];
		int[] E = new int[11];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();	
			if (i % 2 == 1) {
				B[A[i]]++;
			} else {
				E[A[i]]++;
			}
		}
		int BMAX = 0, EMAX = 0;
		int BMAXv = 0, EMAXv = 0;
		int BMAXs = 0, EMAXs = 0;
		int BMAXsv = 0, EMAXsv = 0;
		for (int i = 1; i < 11; i++) {
			if (BMAX < B[i]) {
				BMAXs = BMAX;
				BMAXsv = BMAXv;
				BMAX = B[i];
				BMAXv = i;
			} else if (BMAXs < B[i]) {
				BMAXs = B[i];
				BMAXsv = i;
			}
			if (EMAX < E[i]) {
				EMAXs = EMAX;
				EMAXsv = EMAXv;
				EMAX = E[i];
				EMAXv = i;
			} else if (EMAXs < E[i]) {
				EMAXs = E[i];
				EMAXsv = i;
			}
		}
		if (BMAXv == EMAXv) {
			if (BMAX + EMAXs <= EMAX + BMAXs) { 
				BMAXv = BMAXsv;
				BMAX = BMAXs;
			} else {
				EMAXv = EMAXsv;
				EMAX = EMAXs;
			}
		}
		int ans = (n - (BMAX + EMAX)) * c;
			
		System.out.println(ans);
	}
}
