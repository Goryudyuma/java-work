import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt(), D = sc.nextInt();
			while(N != 0) {
				 if(D == 0){
					System.out.print("C");
					N--;
				 }else if(N * 2 > D){
					System.out.print("A");
					N--;
					D--;
				} else if(N * 2 == D) {
					System.out.print("B");
					N--;
					D-=2;
				}
			}
			System.out.println("");
		}
	}
}
