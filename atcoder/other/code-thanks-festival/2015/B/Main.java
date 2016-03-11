import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int ary[] = new int[4];
		for (int i = 0; i < 4; i++) {
			ary[i] = sc.nextInt();
		}

		int C = sc.nextInt();

		TreeSet set = new TreeSet();

		for (int i = 0; i < 4; i++) {
			if (C == ary[i]) {
				for (int j = 0; j < 2; j++) {
					int n = (1 - (i / 2)) * 2 + j;
					set.add(ary[n]);
				}
			}
		}
		System.out.println(set.size());
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
