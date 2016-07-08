import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String S = sc.nextLine();
			int JOI = 0, IOI = 0;
			if(S.length() >= 3){
				for (int i = 0; i <= S.length() - 3; i++) {
					if (S.substring(i, i + 3).equals("JOI")) {
						JOI++;
					}else if (S.substring(i, i + 3).equals("IOI")) {
						IOI++;
					}
				}
			}
			System.out.println(JOI);
			System.out.println(IOI);
		}
	}
}
