import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				map.put(sc.next(), sc.nextInt());
			}
			int m = sc.nextInt();
			String[][] memo = new String[m][];
			for (int i = 0; i < m; i++) {
				String S = sc.next();
				int l = sc.nextInt();
				memo[i] = new String[l + 1];
				for (int j = 1; j <= l; j++) {
					memo[i][j] = sc.next();
				}
				memo[i][0] = S;
			}
			boolean f = true;
			while (f) {
				f = false;
				for (int i = 0; i < m; i++) {
					int num = 0;
					for (int j = 1; j < memo[i].length; j++ ) {
						num += map.get(memo[i][j]);
					}
					if (num < map.get(memo[i][0])) {
						f = true;
						map.put(memo[i][0], num);
					}
				}
			}
			System.out.println(map.get(sc.next()));
		}
	}
}
