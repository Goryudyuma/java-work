import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			for(int i = 0; i < 3; i++){
				int time = -((sc.nextInt() * 60 + sc.nextInt()) * 60 + sc.nextInt()) +
					((sc.nextInt() * 60 + sc.nextInt()) * 60 + sc.nextInt());
				System.out.println(time / 3600 + " " + (time / 60 % 60) + " " + (time % 60));
			}
		}
	}
}
