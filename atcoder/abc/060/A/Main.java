import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			String A = sc.next(), B = sc.next(), C = sc.next();
			if(A.charAt(A.length() - 1) == B.charAt(0) && B.charAt(B.length() - 1) == C.charAt(0)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
