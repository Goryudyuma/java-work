import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				int N = sc.nextInt(), M = sc.nextInt();
				if(N==0&&M==0){
					break;
				}
				int[] A = new int[M];
				for(int i = 0; i < N; i++){
					int d = sc.nextInt(), v = sc.nextInt();
					d--;
					A[d] = Math.max(A[d], v);
				}
				int ans = 0;
				for(int i = 0; i < M; i++){
					ans+=A[i];
				}
				System.out.println(ans);
			}
		}
	}
}
