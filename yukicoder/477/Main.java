import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			long N = sc.nextLong(), K = sc.nextLong();
			System.out.println((N/(K+1)) +1);
		}
	}
}
