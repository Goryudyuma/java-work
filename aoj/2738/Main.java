import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int count = 0;
			for(int i = 0; i < N; i++){
				String s = sc.next();
				if(s.equals("A")){
					count++;
				}else{
					count--;
					if(count<0){
						System.out.println("NO");
						return;
					}
				}
			}
			if(count!=0){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
	}
}

