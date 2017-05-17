import java.util.*;

class Main {
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
			int A = sc.nextInt(),
			    B = sc.nextInt(),
			    C = sc.nextInt(),
			    D = sc.nextInt(),
			    E = sc.nextInt();
			int ans = 0;
			for(int i = A; i < B; i++){
				if(i < 0){
					ans += C;
				} else {
					ans +=E;	
				}
			}
			if(A < 0 && 0 < B){
				ans += D;
			}
			System.out.println(ans);
		}
	}
}
