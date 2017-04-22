import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				int N = sc.nextInt();
				if(N == 0) {
					break;
				}
				int[] a = new int[N];
				for(int i = 0; i < N; i++){
					a[i] = sc.nextInt();
				}
				Arrays.sort(a);
				int ans = 1000001;
				for(int i = 0; i < N - 1; i++){
					ans = Math.min(ans, a[i+1] - a[i]);
				}
				System.out.println(ans);
			}
		}
	}
}
