import java.util.*;
 
class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                long N,H,A,B,C,D,E;
                N=sc.nextInt();
                H=sc.nextInt();
                A=sc.nextInt();
                B=sc.nextInt();
                C=sc.nextInt();
                D=sc.nextInt();
                E=sc.nextInt();
                long ans = 1 << 63 - 1;
                for (int i = 0; i <= N; i++) {
                        long q1 = i - 1 , q2 = N + 1;
                        do{
                                long j = (q1 + q2) / 2;
                                long cost = 0;
                                long man = H;
                                cost = i * A + (j - i) * C;
                                man  += i * B + (j - i) * D - (N - j) * E;
                                if (man > 0) {
                                        if ( ans > cost) {
                                                ans = cost;
                                        }
                                        q2 = j;
                                } else {
                                        q1 = j ;
                                }
                        }while(q1 + 1< q2 );
                }
                System.out.println(ans);
        }
}
