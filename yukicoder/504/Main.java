import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int A = 0;
			int rank = 1;
			for(int i = 0; i < N; i++){
				int now = sc.nextInt();
				if(i == 0) {
					A = now;
				} else {
					if(now > A) {
						rank++;
					}
				}
				System.out.println(rank);
			}
		}
	}
}
