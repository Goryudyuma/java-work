import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				break;
			} else if(N == 1){
				System.out.println("deficient number");
				continue;
			}
			long num = 0;
			for (int i = 1; i < Math.sqrt(N); i++) {
				if (N % i == 0) {
					num += i;
					num += N / i;
				}	
			}
			if (Math.sqrt(N) * Math.sqrt(N) == N) {
				num += Math.sqrt(N);
			}
			num -= N;
			if (num == N) {
				System.out.println("perfect number");
			} else if(num < N) {
				System.out.println("deficient number");
			} else {
				System.out.println("abundant number");
			}
		}
	}
}
