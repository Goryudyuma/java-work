import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans;
		switch (N) {
			case 0:ans=32;break;
			case 1:ans=1;break;
			case 2:ans=6;break;
			case 3:ans=0;break;
			case 4:ans=2;break;
			case 5:ans=4;break;
			case 6:ans=7;break;
			case 7:ans=13;break;
			case 8:ans=11;break;
			case 9:ans=5;break;
			default :ans=0;
		}
		System.out.println(ans);
	}
}
