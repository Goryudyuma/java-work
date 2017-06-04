import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			char[] S = sc.next().toCharArray();
			Arrays.sort(S);
			for(int i = 1; i < S.length; i++){
				if(S[i-1] == S[i]){
					System.out.println("no");
					return;
				}
			}
			System.out.println("yes");
		}
	}
}


