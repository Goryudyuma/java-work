import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			long[] A = new long[3], B = new long[3];
			for(int i = 0; i < 3; i++){
				B[i] = sc.nextLong();
				if(B[i] % 2 == 1) {
					System.out.println(0);
					return;
				}
			}
			Arrays.sort(B);
			Set<long[]> set = new HashSet<>();
			long num = 0;
			while(!Arrays.equals(A, B)){
				num++;
				A = Arrays.copyOf(B, B.length);
				B[0] = (A[0] + A[1]) / 2;
				B[1] = (A[1] + A[2]) / 2;
				B[2] = (A[2] + A[0]) / 2;
				if(B[0] % 2 == 1 || B[1] % 2 == 1 || B[2] % 2 == 1){
					System.out.println(num);
					return;
				}
				Arrays.sort(B);
			}
			System.out.println(-1);
		}
	}
}

