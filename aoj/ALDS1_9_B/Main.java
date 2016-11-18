import java.util.*;

class Main {
	public static int H;
	public static long[] A;
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			H = sc.nextInt();
			A = new long[H];
			for (int i = 0; i < H; i++) {
				A[i] = sc.nextLong();
			}
			for (int i = H / 2;  i >= 0; i--) {
				maxHeapify(i);
			}
			for (int i = 0; i < H; i++) {
				System.out.print(" "+A[i]);
			}
			System.out.println("");
		}
	}
	public static void maxHeapify(int i) {
		int left = i * 2 + 1, right = i * 2 + 2, largest;
		if (left < H && A[left] > A[i]) {
			largest = left;
		} else {
			largest = i;
		}
		if (right < H && A[right] > A[largest]) {
			largest = right;
		}

		if (largest != i) {
			long tmp = A[i];
			A[i] = A[largest];
			A[largest] = tmp;
			maxHeapify(largest);
		}
	}
}
