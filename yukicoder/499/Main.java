import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			long N = sc.nextLong();
			if(N==0){
				System.out.println(0);
				return;
			}
			solve(N);
			System.out.println("");
		}
	}
	private static void solve(long N){
		if(N==0){
			return;
		}
		solve(N/7);
		System.out.print(N%7);
		return;
	}
}
