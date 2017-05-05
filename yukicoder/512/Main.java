import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			long X = sc.nextLong(), Y = sc.nextLong();
			int N = sc.nextInt();
			long[] A = new long[N];
			long Xlen = 0, Ylen = 0;
			for(int i = 0; i < N; i++) {
				A[i] = sc.nextLong();
				Ylen = A[i];
				if(i != 0) {
					Xlen = A[i-1];
					if(Xlen * Y > Ylen * X ) {
						System.out.println("NO");
						return;
					}
				}
			}
			System.out.println("YES");
		}
	}
}

