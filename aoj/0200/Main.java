import java.util.*;

class Main{
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 0 && m == 0)break;
            int len[][] = new int[m][m];
            int cost[][] = new int[m][m];

            for(int i = 0; i < m; i++){
                for(int j = 0; j < m; j++){
                    len[i][j]=1<<28;
                    cost[i][j]=1<<28;
                }
                len[i][i] = 0;
                cost[i][i] = 0;
            }
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;
                int c = sc.nextInt();
                int t = sc.nextInt();
                len[a][b] = len[b][a] = Math.min(len[a][b], t);
                cost[a][b] = cost[b][a] = Math.min(cost[a][b], c);
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < m; k++) {
                        len[j][k] = Math.min(len[j][k], len[j][i] + len[i][k]);
                        len[k][j] = len[j][k];
                        cost[j][k] = Math.min(cost[j][k], cost[j][i] + cost[i][k]);
                        cost[k][j] = cost[j][k];
                    }
                }
            }
            int l = sc.nextInt();
            for (int i = 0; i < l; i++) {
                int p = sc.nextInt() - 1;
                int q = sc.nextInt() - 1;
                int r = sc.nextInt();
                if (r == 0) {
                    System.out.println(cost[p][q]);
                } else {
                    System.out.println(len[p][q]);
                }
            }
        }
    }
}
