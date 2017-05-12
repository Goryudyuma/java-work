import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			double a = sc.nextDouble(), b = sc.nextDouble();
			if(a != b){
				System.out.printf("%.10f\n", Math.sqrt(Math.abs(a * a - b * b)));
			}else{
				System.out.printf("%.10f\n", Math.sqrt(Math.abs(a * a + b * b)));
			}
		}
	}
}
