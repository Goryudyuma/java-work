import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			long N = sc.nextLong();
			long ans = 1;
			boolean f = false;
			for(long i = 1; i <= N; i++){
				ans *= i;
				if(f && ans == 0){
					break;
				}
				if(ans >= 1000000000000L){
					f = true;
					ans %= 1000000000000L;
				}
			}
			if(f){
				System.out.printf("%012d\n", ans);
			} else {
				System.out.println(ans);
			}
		}
	}
}
