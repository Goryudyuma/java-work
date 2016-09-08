import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double[] d = new double[4];
		System.out.println("? 1");
		d[0] = sc.nextDouble();
		System.out.println("? 2");
		d[1] = sc.nextDouble();
		System.out.println("? 3");
		d[2] = sc.nextDouble();
		System.out.println("? 4");
		d[3] = sc.nextDouble();
		double g = (d[3] - d[2] - d[1] + d[0]) / -2.0;
		double v = (d[1] - d[0] + g * 3.0 / 2.0) * Math.sqrt(2);
		double h = d[0] + g/2.0 - v/Math.sqrt(2);
		System.out.println("! "+ h + " " + v + " " + g);
	}
}
