import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt(), A = sc.nextInt();
			int[] D = new int[N];
			for(int i = 0; i < N; i++){
				D[i] = sc.nextInt();
			}
			int ans = 0;
			for(int i = 0; i < N; i++){
				if(i!=0 && i * A % N == 0){
					break;
				}
				int vmax = 0, vmin = 101;
				for(int j = 0; j < A; j++){
					vmax = Math.max(vmax, D[(i*A + j)%N]);
					vmin = Math.min(vmin, D[(i*A + j)%N]);
				}
				ans += vmax - vmin;
			}
			System.out.println(ans);
		}
	}
}
