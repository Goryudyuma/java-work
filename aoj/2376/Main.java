import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int count = 0;
			boolean[] flag = new boolean[N];
			for(int i = 0; i < N; i++){
				String s = sc.next();
				for(int j = 0; j < N; j++) {
					if(s.charAt(j) == 'Y'){
						flag[j] = true;
					}
				}
			}
			for(int i = 0; i < N; i++) {
				if(flag[i]){
					count++;
				}
			}
			count = N - count;
			count /= 2;
			if(count%2 == 1) {
				System.out.println("Taro");
			}else{
				System.out.println("Hanako");
			}
		}
	}
}

