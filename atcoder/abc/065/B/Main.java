import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int[] A = new int[N];
			for(int i = 0; i < N; i++){
				A[i] = sc.nextInt();
			}
			int now = 0;
			for(int i = 0; i < N; i++){
				now = A[now] - 1;
				if(now == 1) {
					System.out.println(i+1);
					return;
				}
			}
			System.out.println(-1);
		}
	}
}
