import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			long A = sc.nextLong(), B = sc.nextLong();
			if(B<=0 || B > A){
				A = 0;
			}else{
				if(A==B*2-1){
					A--;
				}else{
					A-=2;
				}
			}
			System.out.println(A);
		}
	}
}
