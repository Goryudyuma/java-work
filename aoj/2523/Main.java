import java.util.*;

public class Main{
	public static void main(String[] main){
		try(Scanner sc = new Scanner(System.in)){
			long n = sc.nextLong(), T = sc.nextLong();
			String S = sc.next();
			double num = 0;
			for(int i = 2; i < S.length(); i+=4){
				num += Math.pow(n, Character.getNumericValue(S.charAt(i)));
			}
			if(num * T > 1e9){
				System.out.println("TLE");
			} else {
				System.out.println((long)num * T);
			}
		}
	}
}
