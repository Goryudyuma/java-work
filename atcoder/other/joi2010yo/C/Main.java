import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt(), M = sc.nextInt();
			int[] len = new int[N];
			for(int i = 0; i < N; i++){
				len[i] = 100000;
			}
			len[0] = 0;
			int[] A = new int[M];
			int[] B = new int[M];
			for(int i = 0; i < M; i++){
				A[i] = sc.nextInt();
				B[i] = sc.nextInt();
				A[i]--; B[i]--;

				len[B[i]] = Math.min(len[B[i]], len[A[i]] + 1);
				len[A[i]] = Math.min(len[A[i]], len[B[i]] + 1);
			}
			for(int i = 0; i < M; i++){
				len[B[i]] = Math.min(len[B[i]], len[A[i]] + 1);
				len[A[i]] = Math.min(len[A[i]], len[B[i]] + 1);
			}
			int ans = 0;
			for(int i = 1; i < N; i++){
				if(len[i] <= 2){
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
