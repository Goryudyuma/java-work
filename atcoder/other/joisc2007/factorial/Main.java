import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			long N = sc.nextLong();
			long limit = (long)Math.sqrt(N);
			long ans = 0;
			for(long i = 2; N != 1 && i <= limit; i++){
				long count = 0;
				while(N%i == 0){
					count++;
					N /= i;
				}
				ans = Math.max(count * i, ans);
			}
			ans = Math.max(N, ans);
			System.out.println(ans);
		}
	}
}
