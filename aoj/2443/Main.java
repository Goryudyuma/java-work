import java.util.*;

public class Main{
	public static void main(String[] args){
		HashMap<Long,Long> map = new HashMap<Long,Long>();
		HashMap<Long,Long> map2 = new HashMap<Long,Long>();
		Queue<Long> que = new ArrayDeque<Long>();

		try(Scanner sc = new Scanner(System.in)){
			Long N = sc.nextLong();
			{
				Long num = 0L;
				for(Long i = 0L; i < N; i++){
					num <<= 4;
					num += i + 1;
				}	
				map.put(num, 0L);
				que.add(num);
			}
			while(true){
				Long now = que.poll();
				if(now == null){
					break;
				}
				//System.out.println(now + " " + map.get(now));
				if(map.get(now) == 3){
					continue;
				}
				for(int i = 0; i < N; i++){
					for(int j = i + 1; j < N; j++){
						Long next = now;
						for(int k = 0; k < (j - i + 1) / 2; k++){
							Long num1 = (next >> ((i + k)*4)) % 16;
							next -= (num1 << ((i + k) * 4));
							Long num2 = (next >> ((j - k)*4)) % 16;
							next -= num2 << (((j - k) * 4));
							next += num2 << (((i + k) * 4));
							next += num1 << (((j - k) * 4));
						}
						if(!map.containsKey(next)){
							map.put(next, map.get(now) + 1);
							que.add(next);
						}
					}
				}
			}

			Long ans = N - 1;

			{
				Long num = 0L;
				for(Long i = 0L; i < N; i++){
					num <<= 4;
					num += sc.nextLong();
				}	
				map2.put(num, 0L);
				que.add(num);
			}
			while(true){
				Long now = que.poll();
				//System.out.println(now);
				if(now == null){
					break;
				}
				if(map2.containsKey(now)){
					if(map.containsKey(now) ){
						ans = Math.min(ans, map.get(now) + map2.get(now));
						continue;
					}
					if(map2.get(now) == 3) {
						continue;
					}
				}
				for(int i = 0; i < N; i++){
					for(int j = i + 1; j < N; j++){
						Long next = now;
						for(int k = 0; k < (j - i + 1) / 2; k++){
							Long num1 = (next >> ((i + k)*4)) % 16;
							next -= (num1 << ((i + k) * 4));
							Long num2 = (next >> ((j - k)*4)) % 16;
							next -= num2 << (((j - k) * 4));
							next += num2 << (((i + k) * 4));
							next += num1 << (((j - k) * 4));
						}
						if(!map2.containsKey(next)){
							map2.put(next, map2.get(now) + 1);
							que.add(next);
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}
