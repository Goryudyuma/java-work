import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()){
				System.out.printf("3C%02d\n",(1+(sc.nextInt()-1)%39));
			}
		}
	}
}
