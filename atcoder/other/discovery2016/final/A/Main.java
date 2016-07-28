import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x[] = new int[N];
		for (int i = 0; i < N; i++) {
			x[sc.nextInt() - 1] = i;
		}
		for (int i = 0; i < N; i++) {
			int d = x[i] + 1;
			if (d == 1) {
				System.out.println("100000");
			}else if(d==2){
				System.out.println("50000");
			}else if(d==3){
				System.out.println("30000");
			}else if(d==4){
				System.out.println("20000");
			}else if(d==5){
				System.out.println("10000");
			}else{
				System.out.println("0");
			}
		}
	}
}
