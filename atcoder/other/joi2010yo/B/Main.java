import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt(), M = sc.nextInt();
			int[] A = new int[N];
			for(int i = 0; i < N; i++){
				A[i] = sc.nextInt();
			}
			int now = 0;
			for(int j = 0; j < M; j++){
				now += sc.nextInt();
				if(now >= N-1) {
					System.out.println(j + 1);
					break;
				}
				now += A[now];
				if(now >= N-1) {
					System.out.println(j + 1);
					break;
				}
			}
		}
	}
}
