import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int A = sc.nextInt(),
			    B = sc.nextInt(),
			    C = sc.nextInt(),
			    D = sc.nextInt(),
			    E = sc.nextInt(),
			    ans = 0;
			if(B<=0){
				ans = (B - A) * C;
			} else if (0<=A){
				ans = (B - A) * E;
			} else {
				ans = (- A) * C + D + (B) * E;
			}
			System.out.println(ans);
		}
	}
}
