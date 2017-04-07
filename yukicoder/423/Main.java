import java.util.*;

public class Main{
	private static int stringtoint(String S){
		return Integer.parseInt(S.replaceAll("hamu", "1").replaceAll("ham", "0"), 2);
	}

	private static String inttostring(int N){
		return Integer.toBinaryString(N).replaceAll("1", "hamu").replaceAll("0", "ham");
	}

	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			System.out.println(inttostring(2*stringtoint(sc.next())));
		}
	}
}

