import java.util.*;

public class Main{
	public static void main(String[] args){
		boolean[] prime = new boolean[100001];
		prime[0]=true;
		prime[1]=true;
		for(int i = 2; i < 100001; i++){
			if(!prime[i]){
				int j = 2;
				while(i*j<100001){
					prime[i*j]=true;
					j++;
				}
			}
		}
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				Long N = sc.nextLong();
				if(N==0){
					break;
				}
				Long ans = 0L;
				Integer i = 2;
				while(N != 1){
					while(N%i == 0){
						ans=(Long)(long)(int)i;
						N/=i;
					}
					while(++i < 100001 && prime[i]){
					}
					if(i >= 100001){
						ans = N;
						break;
					}
				}
				System.out.println(ans);
			}
		}
	}
}
