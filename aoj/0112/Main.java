import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int N = sc.nextInt();
			if(N==0) {
				break;
			}
			int[] a = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			long ans = 0;
			for (int i = 0; i < N; i++) {
				ans += (N - i - 1) * a[i];
			}
			System.out.println(ans);
		}
	}
}
