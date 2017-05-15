import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int[] A = new int[N];
			for(int i = 0; i < N; i++){
				A[i] = sc.nextInt();
			}
			int ans = 0;
			for(int i = 0; i < N-2; i++){
				int j = i + 1;
				int k = i + 2;
				if(A[i] != A[j] && A[j] != A[k] && A[i] != A[k]){
					if((A[j] > A[i] && A[j] > A[k]) || (A[j] < A[i] && A[j] < A[k])){
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}

