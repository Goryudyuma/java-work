import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		if (sc.nextInt()+sc.nextInt()*2+sc.nextInt()*4>=3) {
			System.out.println("Open");
		} else {
			System.out.println("Close");
		}
	}
}
