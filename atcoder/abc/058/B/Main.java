import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			String O = sc.next(), E = sc.next();
			for(int i = 0; i < O.length(); i++) {
				System.out.print(O.charAt(i));
				if(i < E.length()){
					System.out.print(E.charAt(i));
				}
			}
			System.out.println("");
		}
	}
}
