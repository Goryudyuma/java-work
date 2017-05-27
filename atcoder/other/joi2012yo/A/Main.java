import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			System.out.println(Math.min(sc.nextInt(), Math.min(sc.nextInt(), sc.nextInt())) + Math.min(sc.nextInt(), sc.nextInt()) - 50);
		}
	}
}
