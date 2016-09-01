import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int N = sc.nextInt();
			if (N == 0) {
				break;
			}
			String[] Sinput = new String[N];
			for (int i = 0; i < N; i++) {
				Sinput[i] = sc.next();
			}
			boolean finish = false;
			for (int q = 1; q <= 50; q++) {
				String[] memo = new String[N];
				boolean fx = false;
				for (int x = 0; x < N; x++) {
					int count = 0;
					memo[x] += Sinput[x].charAt(0);
					count++;
					int idx = 0;
					while (idx < Sinput[x].length() - 1 && count < q) {
						switch (Sinput[x].charAt(idx)) {
							case 'a':
							case 'i':
							case 'u':
							case 'e':
							case 'o':memo[x]+=Sinput[x].charAt(idx + 1);count++;break;
						}
						idx++;
					}
					boolean f = false;
					for (int y = 0; y < x; y++) {
						if (memo[x].equals(memo[y])) {
							f = true;
							break;
						}
					}
					if (f) {
						fx = true;
						break;
					}
				}
				if (fx) {
					continue;
				}
				System.out.println(q);
				finish = true;
				break;
			}
			if (!finish) {
				System.out.println(-1);
			}
		}
	}
}
