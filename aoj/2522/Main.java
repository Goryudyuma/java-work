import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{6})";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(S);

		if (m.find()) {
			System.out.println("VALID");
		} else {
			System.out.println("INVALID");
		}
	}
}
