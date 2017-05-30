import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			String S = sc.next();
			for(int i = 0; i < S.length(); i++){
				System.out.print((char)((((int)(S.charAt(i))-((int)'A'))+23)%26+(int)'A'));
			}
			System.out.println("");
			}
	}
}
