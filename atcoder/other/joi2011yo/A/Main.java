import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int now = 0;
			while(sc.hasNext()){
				now += sc.nextInt();
			}
			System.out.println(now / 60);
			System.out.println(now % 60);
		}
	}
}
