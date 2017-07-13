import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int[] A = new int[101];
			while(true){
				String[] SS = sc.next().split(",", 0);
				int team = Integer.parseInt(SS[0]);
				int score = Integer.parseInt(SS[1]);
				if(team == 0 && score == 0){
					break;
				}

				A[team] = score;
			}
			while(sc.hasNext()){
				int num = A[sc.nextInt()];
				Set<Integer> set = new HashSet<>();
				for(int i = 0; i < 101; i++){
					if(num < A[i]){
						set.add(A[i]);
					}
				}
				System.out.println(set.size() + 1);
			}
		}
	}
}
