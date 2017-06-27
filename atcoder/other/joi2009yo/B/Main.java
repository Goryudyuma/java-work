import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int[] A = new int[10], B = new int[10];
			for(int i = 0; i < 10; i++){
				A[i] = sc.nextInt();
			}
			for(int i = 0; i < 10; i++){
				B[i] = sc.nextInt();
			}
			Arrays.sort(A);
			Arrays.sort(B);
			System.out.println((A[9]+A[8]+A[7]) + " " + (B[9]+B[8]+B[7]));
		}
	}
}
