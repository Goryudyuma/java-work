import java.util.*;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			if(-sc.nextInt()+sc.nextInt()*2==sc.nextInt()){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
