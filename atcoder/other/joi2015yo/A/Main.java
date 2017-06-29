import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int A = sc.nextInt(),
			    B = sc.nextInt(),
			    C = sc.nextInt(),
			    D = sc.nextInt(),
			    P = sc.nextInt();
			System.out.println(Math.min(A*P, Math.max(P-C,0)*D+B));
		}
	}
}
