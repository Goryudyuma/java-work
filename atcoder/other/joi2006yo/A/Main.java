import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt(), A = 0, B = 0;
			for(int i = 0; i < N; i++){
				int a = sc.nextInt(), b = sc.nextInt();
				if(a == b){
					A += a;
					B += b;
				}else if(b < a){
					A += a + b;
				}else{
					B += a + b;
				}
			}
			System.out.println(A + " " + B);
		}
	}
}
