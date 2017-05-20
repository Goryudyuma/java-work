import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int x = sc.nextInt(), y = sc.nextInt();
			if((x==2&& y == 2)||(check(x)&&check(y))||(x!=2&&y!=2&&!check(x)&&!check(y)) ){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
	private static boolean check(int a){
		if(a==4||a==6||a==9||a==11){
			return true;
		}else{
			return false;
		}
	}
}

