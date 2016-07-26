import java.util.*;
import java.util.regex.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		String s = sc.next();
		for (int i = 0; i < X.length(); i++) {
			String regex = String.valueOf(X.charAt(i));
			Pattern p = Pattern.compile(regex);
			Matcher m = m = p.matcher(s);
			s = m.replaceAll("");
		}
		System.out.println(s);
	}
}
