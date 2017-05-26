import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int sum = 0;
			for(int i = 0; i < 5; i++){
				sum += Math.max(sc.nextInt(), 40);
			}
			System.out.println(sum / 5);
		}
	}
}
