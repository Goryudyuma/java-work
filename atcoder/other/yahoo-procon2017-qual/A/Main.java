import java.util.*;

class Main {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] S = sc.next().split("");
			Arrays.sort(S);
			if (String.join("",S).equals("ahooy")) {
				System.out.println("YES");
			} else {
				System.out.println("NO");	
			}
		}
	}
}
