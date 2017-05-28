import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			System.out.println(Math.max(sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt(), sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt()));
		}
	}
}
