import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			long W = sc.nextLong();
			long[] dp = new long[N*100+1];
			for(int i = 0; i < N*100+1; i++){
				dp[i] = Long.MAX_VALUE / 6;
			}
			dp[0] = 0;
			for(int i = 0; i < N; i++){
				int v = sc.nextInt();
				long w = sc.nextLong();
				for(int j = N * 100 - v; j >= 0; j--){
					if(dp[j] + w <= Math.min(dp[j+v], W)){
						dp[j+v] = dp[j] + w;
					}
				}
			}
			int ans = 0;
			for(int i = 0; i < N*100+1; i++){
				if(dp[i] != Long.MAX_VALUE / 6){
					ans = i;
				}
			}
			System.out.println(ans);
		}
	}
}

