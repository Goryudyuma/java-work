import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt(), M = sc.nextInt();
			int[][] D = new int[M][2];
			for(int i = 0; i < M; i++){
				D[i][0] = sc.nextInt();
				D[i][1] = sc.nextInt();
			}
			Queue<Integer> que = new ArrayDeque<Integer>();
			que.add(1);
			int ans = 0;
			boolean[] f = new boolean[N];
			while(true){
				Integer now = que.poll();
				if(now == null){
					break;
				}
				if(f[now-1] == true){
					continue;
				}
				f[now-1] = true;
				ans++;
				for(int i = 0; i < M; i++){
					if(D[i][1] == now){
						que.add(D[i][0]);
					}
				}
			}
			System.out.println(ans);
		}
	}
}


