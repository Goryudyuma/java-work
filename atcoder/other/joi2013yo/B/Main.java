import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int[][] A = new int[N][3];
			for(int i = 0; i < N; i++){
				for(int j = 0; j < 3; j++){
					A[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i < N; i++){
				int ans = 0;
				for(int k = 0; k < 3; k++){
					int count = 0;
					for(int j = 0; j < N; j++){
						if(A[i][k] == A[j][k]){
							count++;
						}
					}
					if(count == 1){
						ans += A[i][k];
					}
				}
				System.out.println(ans);
			}
		}
	}
}
