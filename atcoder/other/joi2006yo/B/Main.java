import java.util.*;

public class Main{
	public static void main(String[] agrs){
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			HashMap<Character,Character> map = new HashMap<Character,Character>();
			for(int i = 0; i < N; i++){
				map.put(sc.next().charAt(0), sc.next().charAt(0));
			}
			int M = sc.nextInt();
			for(int i = 0; i < M; i++){
				char now = sc.next().charAt(0);
				if(map.get(now)!=null){
					now=map.get(now);
				}
				System.out.print(now);
			}
			System.out.println("");
		}
	}
}

