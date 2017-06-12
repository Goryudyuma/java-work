import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int[] D = new int[9];
			for(int i = 0; i < N; i++){
				int now = sc.nextInt();
				if(now>=3200){
					D[8]++;
				}else{
					D[now/400]++;
				}
			}
			int ansmin = 0, ansmax = 0;
			for(int i = 0; i < 8; i++){
				if(D[i]!=0){
					ansmin++;
					ansmax++;
				}
			}
			if(ansmin == 0){
				ansmin++;
			}
			ansmax += D[8];
			System.out.println(ansmin + " " + ansmax);
		}
	}
}
