import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Boolean[][] check = new Boolean[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				check[i][j] = false;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i + 1 < 3) {
					check[i*3+j][(i+1)*3+j] = true;
					check[(i+1)*3+j][i*3+j] = true;
				}
				if (i - 1 >= 0) {
					check[i*3+j][(i-1)*3+j] = true;
					check[(i-1)*3+j][i*3+j] = true;
				}
				if (j + 1 < 3) {
					check[i*3+j][i*3+j+1] = true;
					check[i*3+j+1][i*3+j] = true;
				}
				if (j - 1 >= 0) {
					check[i*3+j][i*3+j-1] = true;
					check[i*3+j-1][i*3+j] = true;
				}
			}
		}
		for (int i = 0; i < 1000; i++) {
			String S = sc.next();
			int now = S.charAt(0) - 'A';
			boolean f = true;
			for (int j = 1; j < S.length(); j++) {
				int next = S.charAt(j) - 'A';
				if (check[now][next]) {
					now = next;
					continue;
				}else{
					f = false;
					break;
				}
			}
			if (f) {
				System.out.println(S);
			}
		}
	}
}
