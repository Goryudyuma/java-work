import java.util.*;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
		       	long x = sc.nextLong();
			long sum = 0;
			for(int i = 0; i < n; i++) {
				sum += sc.nextLong();
			}
			if(n * x == sum){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
