import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			String[] A = new String[N+1], Z = new String[N+1];
			String S = "";

			for(int i = 0; i <= N; i++){
				A[i] = Z[i] = S = sc.next();
				A[i] = A[i].replaceAll("\\?", "a");
				Z[i] = Z[i].replaceAll("\\?", "z");
			}
			Arrays.sort(A);
			Arrays.sort(Z);
			int start = 0, goal = 0;
			for(int i = 0; i <= N; i++){
				if(A[i].equals(S)){
					goal = i;
				}
			}
			for(int i = N; i >= 0; i--){
				if(Z[i].equals(S)){
					start = i;
				}
			}
			start++; goal++;
			for(int i = start; i <= goal; i++){
				if(i == goal){
					System.out.println(i);
				} else {
					System.out.print(i+" ");
				}
			}
		}
	}
}


