import java.util.*;

public class Main{
	public static void main(String[] args){
		byte[] A = new byte[100000];
		int[] B = new int[102];
		int N;
		int i;
		try(Scanner sc = new Scanner(System.in)){
			N = sc.nextInt();
			for(i = 0; i < N; i++){
				A[i] = (byte)sc.nextInt();
				B[(int)A[i]]++;
			}
			for(i = 100; i >= 0; i--){
				B[i] += B[i+1];
			}
			for(i = 0; i < N; i++){
				System.out.println(B[(int)A[i]+1]+1);
			}
		}
	}
}
