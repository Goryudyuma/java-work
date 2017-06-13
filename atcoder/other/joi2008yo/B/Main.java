import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			String S = sc.next();
			int joi = 0, ioi = 0;
			for(int i = 0; i < S.length() - 2; i++){
				if(S.substring(i, i+3).equals("JOI")){
					joi++;
				}else if(S.substring(i, i+3).equals("IOI")){
					ioi++;
				}
			}
			System.out.println(joi);
			System.out.println(ioi);
		}
	}
}
