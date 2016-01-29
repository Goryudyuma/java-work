import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Long N, X;
		N = sc.nextLong();
		X = sc.nextLong();

		Map<Long, Long> M = new TreeMap<Long, Long>();
		Map<Long, Long> P = new TreeMap<Long, Long>();
		M.put(0L, 1L);
		P.put(0L, 1L);
		for (Long i = 0L; i < N / 2; i++) {
			Long W = sc.nextLong();
			Map<Long, Long>M_ = new TreeMap<Long, Long>(M);
			for(Map.Entry<Long, Long> x : M.entrySet()){
				if (x.getKey()+W > X) {
					break;
				}
				Long num = 0L;
				if (M_.containsKey(x.getKey() + W)) {
					num = M_.get(x.getKey() + W);
				}
				M_.put(x.getKey() + W, num + x.getValue());
			}
			M = M_;
		}
		for (Long i = N / 2; i < N; i++) {
			Long W = sc.nextLong();
			Map<Long, Long>M_ = new TreeMap<Long, Long>(P);
			for(Map.Entry<Long, Long> x : P.entrySet()){
				if (x.getKey()+W > X) {
					break;
				}
				Long num = 0L;
				if (M_.containsKey(x.getKey() + W)) {
					num = M_.get(x.getKey() + W);
				}
				M_.put(x.getKey() + W, num + x.getValue());
			}
			P = M_;
		}
		Long ans = 0L;
		for(Map.Entry<Long, Long> x : P.entrySet()){
			Long search = X - x.getKey();
			if (M.containsKey(search)) {
				ans += M.get(search) * x.getValue();
			}
		}
		System.out.println(ans);

	}
}
