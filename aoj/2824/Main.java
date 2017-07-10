import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				int T = sc.nextInt(), D = sc.nextInt(), L = sc.nextInt();
				if(T==0 && D == 0 && L == 0){
					break;
				}
				int ans = 0, time = 0;
				for(int i = 0; i < T - 1; i++){
					int x = sc.nextInt();
					if(x>=L){
						time = D - 1;
						ans++;
					}else if(time != 0){
						time--;
						ans++;
					}
				}
				sc.nextInt();
				System.out.println(ans);
			}
		}
	}
}

