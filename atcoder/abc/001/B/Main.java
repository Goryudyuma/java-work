import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		if (m<100) {
			System.out.println("00");
		}else if(m>70000){
		System.out.println("89");
		}else{
			if (m<=5000) {
				System.out.println(String.format("%1$02d",m*10/1000));
			}else if(m<=30000){
				System.out.println((m+50000)/1000);
			}else{
				System.out.println((m/1000-30)/5+80);
			}
		}
	}
}
