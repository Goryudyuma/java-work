import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), now = 0, count = 0;
			int ans = -1;
			for(int i = 0; i < 600; i++){
				if(now <= c && c <= now + a){
					ans = count*60 + c;
					break;
				}
				now += a;
				if(now >= 60){
					count++;
					now %= 60;
					if(0 <= c && c <= now){
						ans = count*60 + c;
						break;
					}
				}
				now += b;
				if(now >= 60){
					count++;
					now %= 60;
				}
			}
			System.out.println(ans);
		}
	}
}
