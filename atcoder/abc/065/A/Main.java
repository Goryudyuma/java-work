import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int X = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
			if(A >= B){
				System.out.println("delicious");
			}else if(B - A <= X){
				System.out.println("safe");
			}else{
				System.out.println("dangerous");
			}
		}
	}
}
