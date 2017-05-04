import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			while(true){
				long R0 = sc.nextLong(), W0 = sc.nextLong(), C = sc.nextLong(), R = sc.nextLong();
				if(R0==0&&W0==0&&C==0&&R==0){
					break;
				}
				System.out.println(Math.max(0L,(W0*C-R0+R-1)/R));
			}
		}
	}
}
