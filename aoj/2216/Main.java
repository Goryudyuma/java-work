import java.util.*;

class Main{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) {
				break;
			}
			b -= a;
			System.out.println((b%500/100)+" "+(b%1000/500)+" "+(b/1000));
		}
	}
}
