import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt(), i = 0;
			while(true){
				if(String.valueOf(N-i).equals(new StringBuilder(String.valueOf(N-i)).reverse().toString())){
					System.out.println(N-i);
					break;
				}
				if(String.valueOf(N+i).equals(new StringBuilder(String.valueOf(N+i)).reverse().toString())){
					System.out.println(N+i);
					break;
				}
				i++;
			}
		}
	}
}
