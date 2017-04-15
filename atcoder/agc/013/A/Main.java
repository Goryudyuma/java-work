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
			int index = 0;
			while(index < N){
				ans++;
				int i = 1;
				while(i + index < N && A[i+index] == A[index]){
					i++;
				}
				if(i+index == N){
					break;
				}
				boolean f = A[index] < A[i+index];
				while(i+index<N&&(f&&A[i+index-1]<=A[i+index]||(!f&&A[i+index-1]>=A[i+index]))){
					i++;
				}
				index += i;
			}
			System.out.println(ans);
		}
	}
}

