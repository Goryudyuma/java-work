import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			String S = sc.next();
			if(S.equals("a") || S.equals("zzzzzzzzzzzzzzzzzzzz")){
				System.out.println("NO");
			}else{
				if(S.length() == 1){
					System.out.println("a"+(char)(S.charAt(0)-1));
				}else{
					int k = -1, j = -1;
					for(int i = 0; i < S.length(); i++){
						if(S.charAt(i) != 'a' && (k == -1 || k == j)){
							k = i;
						}
						if(k!=-1 && j != -1 && k != j){
							break;
						}
						if(S.charAt(i) != 'z' && (j == -1 || k == j)){
							j = i;
						}
						if(k!=-1 && j != -1 && k != j){
							break;
						}
					}
					if(k==-1){
						System.out.print("b");
						for(int i = 2; i < S.length(); i++){
							System.out.print("a");
						}
					}else if(j==-1){
						System.out.print("ay");
						for(int i = 1; i < S.length(); i++){
							System.out.print("z");
						}
					}else{
						for(int i = 0; i < S.length(); i++){
							if(i==k){
								System.out.print((char)(S.charAt(i)-1));
							}else if(j==i){
								System.out.print((char)(S.charAt(i)+1));
							}else{
								System.out.print((char)(S.charAt(i)));
							}
						}
					}
					System.out.println("");
				}
			}
		}
	}
}

