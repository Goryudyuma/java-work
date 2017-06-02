import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = 1000 - sc.nextInt();
			int ans = 0;
			ans+=N/500;
			N%=500;
			ans+=N/100;
			N%=100;
			ans+=N/50;
			N%=50;
			ans+=N/10;
			N%=10;
			ans+=N/5;
			N%=5;
			ans+=N/1;
			N%=1;
			System.out.println(ans);
		}
	}
}
