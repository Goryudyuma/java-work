import java.util.*;

class Main {
	public static void main(String args[]) {
		int[] stack = new int[1000];
		int i = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				String S = sc.next();
				if (S.charAt(0) == '+') {
					stack[i-2] += stack[i-1];
					i--;
				} else if(S.charAt(0) == '*'){
					stack[i-2] *= stack[i-1];
					i--;
				} else if(S.charAt(0) == '-'){
					stack[i-2] -= stack[i-1];
					i--;
				} else {
					stack[i] = Integer.parseInt(S);
					i++;
				}
			}
		}
		System.out.println(stack[0]);
	}
}
