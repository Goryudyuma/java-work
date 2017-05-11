import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int[] X = new int[100];
			for(int i = 0; i < 3 * N; i++){
				X[sc.nextInt() - 1]++;
			}
			int ans = 0, count = 0;
			for(int i = 0; i < 100; i++){
				ans += X[i] / 2;
				count += X[i] % 2;
			}
			ans += count / 4;
			System.out.println(ans);
		}
	}
}
