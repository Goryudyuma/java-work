import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			long N = sc.nextLong();
			while (N!=0) {
				int i;
				for (i = 0; i < N; i++) {
					if (i*(i+1)/2>=N) {
						break;
					}
				}
				System.out.println(i);
				N-=i;
			}
		}
	}
}
