import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			for(int i = 0; i < 9; i++){
				N -= sc.nextInt();
			}
			System.out.println(N);
		}
	}
}
