import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt(), K = sc.nextInt();
			int Nmemo = N;
			for(int i = 0; i < K; i++){
				N -= sc.nextInt();
				N = Math.abs(N);
				if(N == 0){
					break;
				}
			}
			System.out.println(Nmemo - N);
		}
	}
}
				
