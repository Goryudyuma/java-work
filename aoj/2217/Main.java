import java.util.*;

class Main {
	public static int check[][];
	public static int map[][][];

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		while( true ){
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			map = new int[n][n][2];
			check = new int[n][n];
			for (int j = 0; j < n; j++) {
				for (int i = 0; i < n; i++) {
					for (int k = 0; k < 2; k++) {
						map[i][j][k] = sc.nextInt();
					}
				}
			}
			int num = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (check[i][j] == 0) {
						int pair[] = new int[2];
						pair[0] = i;
						pair[1] = j;
						if(num == func(pair, num)){
							num++;
						}
					}
				}
			}
			System.out.println(num - 1);
		}
	}

	public static int func(int now[], int num){
		if (check[now[0]][now[1]] == 0) {
			check[now[0]][now[1]] = num;
			return check[now[0]][now[1]] = func(map[now[0]][now[1]], num);
		} else {
			return check[now[0]][now[1]];
		}
	}
}
