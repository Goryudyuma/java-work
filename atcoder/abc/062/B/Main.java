import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt(), M = sc.nextInt();
			for(int i = 0; i < M + 2; i++){
				System.out.print("#");
			}
			System.out.println("");
			for(int i = 0; i < N; i++){
				System.out.println("#" + sc.next() + "#");
			}
			for(int i = 0; i < M + 2; i++){
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}
