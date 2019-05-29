import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long k = sc.nextLong();
 
        List<Long> l = new ArrayList<Long>();
        Long ansMin = 0L, ansMax = 0L;
 
        for (int i = 0; i < n; i++) {
            Long now = sc.nextLong();
            l.add(now);
            ansMin = Math.max(ansMin, now - 1);
            ansMax += now;
        }
 
 
        while (ansMin + 1 < ansMax) {
            Long ansMid = (ansMin + ansMax) / 2;
 
            Long x = 0L;
            Long count = 0L;
            for (int i = 0; i < n; i++) {
                if (x + l.get(i) > ansMid) {
                    x = 0L;
                    count++;
                }
                x += l.get(i);
            }
            if (x != 0) {
                count++;
            }
            if (count <= k) {
                ansMax = ansMid;
            } else {
                ansMin = ansMid;
            }
        }
        System.out.println(ansMin + 1);
    }
}
