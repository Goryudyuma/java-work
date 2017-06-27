import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			if(!sc.hasNext()){
				System.out.println(0);
				return;
			}
			String S = sc.next();
			int ans = 0;
			for(int i = 0; i < S.length() / 2; i++){
				if(!((S.charAt(i) == 'i' && S.charAt(S.length()-i-1) == 'i')||
						(S.charAt(i) == 'w' && S.charAt(S.length()-i-1) == 'w')||
						(S.charAt(i) == '(' && S.charAt(S.length()-i-1) == ')')||
						(S.charAt(i) == ')' && S.charAt(S.length()-i-1) == '(')
				  )){
					ans++;
				  }
			}
			if(S.length() % 2 == 1 && (S.charAt(S.length()/2)== '(' || S.charAt(S.length()/2)== ')')){
				ans++;
			}
			System.out.println(ans);
		}
	}
}
