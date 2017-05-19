import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int[] a = new int[3];
			for(int i = 0; i < N; i++){
				a[sc.nextInt()%3]++;
			}
			if(a[1]==0&&a[2]==0){
				System.out.println(1);
			}else{
				int ans = a[0];
				ans+=Math.min(a[1],a[2])*2;
				ans+=Math.min(3,Math.max(a[1],a[2])-Math.min(a[1],a[2]));
				System.out.println(ans);
			}
		}
	}
}
