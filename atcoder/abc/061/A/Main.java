import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
			if(A <= C && C <= B){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}
