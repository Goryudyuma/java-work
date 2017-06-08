import java.util.*;

public class Main{
	public static void main(String[] agrs){
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt(), m = sc.nextInt(), ans = 0;
			for(int i = 0; i < n; i++){
				int memo=0;
				for(int j = 0; j < m; j++){
					memo += sc.nextInt();
				}
				ans = Math.max(ans, memo);
			}
			System.out.println(ans);
		}
	}
}
