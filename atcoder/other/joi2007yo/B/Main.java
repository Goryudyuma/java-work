import java.util.*;

public class Main{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int[] input = new int[28];
			for(int i = 0; i < 28; i++){
				input[i] = sc.nextInt() - 1;
			}
			for(int i = 0; i < 30; i++){
				boolean f = false;
				for(int j = 0; j < 28; j++){
					if(input[j] == i){
						f=true;
					}
				}
				if(!f){
					System.out.println(i+1);
				}
			}
		}
	}
}
