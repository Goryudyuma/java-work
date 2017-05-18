import java.util.*;

class Main {
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()){
				double t1 = sc.nextDouble(), t2 = sc.nextDouble();
				if(t1 < 35.5 && t2 < 71.0){
					System.out.println("AAA");
				}else if(t1 < 37.5 && t2 < 77.0){
					System.out.println("AA");
				}else if(t1 < 40.0 && t2 < 83.0){
					System.out.println("A");
				}else if(t1 < 43.0 && t2 < 89.0){
					System.out.println("B");
				}else if(t1 < 50.0 && t2 < 105.0){
					System.out.println("C");
				}else if(t1 < 55.0 && t2 < 116.0){
					System.out.println("D");
				}else if(t1 < 70.0 && t2 < 148.0){
					System.out.println("E");
				}else{
					System.out.println("NA");
				}
			}
		}

	}
}
