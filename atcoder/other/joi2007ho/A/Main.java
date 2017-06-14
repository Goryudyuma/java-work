import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt(), K = sc.nextInt();
			long[] a = new long[N + 1];
			long ans = -9999999999999L;
			for(int i = 1; i <= N; i++){
				a[i] = sc.nextLong() + a[i - 1];
				if(i >= K){
					ans = Math.max(ans, a[i] - a[i-K]);
				}
			}
			System.out.println(ans);
		}
	}
}
