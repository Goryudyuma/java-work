import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				int N = sc.nextInt(), M = sc.nextInt();
				if(N == 0 && M == 0){
					break;
				}
				int[] Vmin = new int[N], Vmax = new int[N];
				
				for(int i = 0; i < M; i++){
					int v = sc.nextInt();
					int num = sc.nextInt();
					for(int j = 0; j < num; j++){
						int p = sc.nextInt() - 1;
						Vmax[p] += v;
						if(num == 1){
							Vmin[p] += v;
						}
					}
				}

				int ansmin = 0, ansmax = 0;
				for(int i = 0; i < N; i++){
					if(Vmax[i] > Vmax[ansmax]){
						ansmax = i;
					} else if(Vmin[i] < Vmin[ansmin]){
						ansmin = i;
					}
				}

				System.out.println(Vmax[ansmax] - Vmin[ansmin] + 1);
			}
		}
	}
}
