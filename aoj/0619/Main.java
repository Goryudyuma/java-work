import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int A = sc.nextInt(),
			    B = sc.nextInt(),
			    C = sc.nextInt(),
			    D = sc.nextInt(),
			    E = sc.nextInt(),
			    F = sc.nextInt();
			System.out.println(A + B + C + D + Math.max(E, F) - Math.min(Math.min(A,B),Math.min(C,D)));
		}
	}
}	
