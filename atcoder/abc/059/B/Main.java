import java.util.*;
import java.math.*;

public class Main{
	public static void main(String args[]){
		try(Scanner sc = new Scanner(System.in)){
			int a = (new BigInteger(sc.next())).compareTo(new BigInteger(sc.next()));
			if(a == 0){
				System.out.println("EQUAL");
			} else if(a==1){
				System.out.println("GREATER");
			} else {
				System.out.println("LESS");
			}
		}
	}
}

