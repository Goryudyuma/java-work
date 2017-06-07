import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int L = sc.nextInt(),
			    A = sc.nextInt(),
			    B = sc.nextInt(),
			    C = sc.nextInt(),
			    D = sc.nextInt();
			System.out.println(L-Math.max((A+C-1)/C,(B+D-1)/D) );
		}
	}
}

