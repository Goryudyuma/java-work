import java.util.*;
import java.io.*;

class Main {
	public static long[] A;
	public static int count;
	public static void main(String args[]) {
		count = 0;
		new Thread(null, ()->{
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			A = new long[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextLong();
			}
			mergeSort(0, N);
			for (int i = 0; i < N; i++) {
				System.out.print(A[i]);
				System.out.print(i != N-1 ? " ":"\n");
			}
			System.out.println(count);
		}, "", 1<<24).start();
	}
	public static void merge(int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		long[] L = new long[n1 + 1];
		long[] R = new long[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = A[mid + i];
		}
		L[n1] = 1000000001L;
		R[n2] = 1000000001L;
		int i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			count++;
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
		}
	}
	public static void mergeSort(int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(left, mid);
			mergeSort(mid, right);
			merge(left, mid, right);
		}
	}
	private static class Scanner {
		BufferedReader r;
		StreamTokenizer st;

		public Scanner(InputStream in) {
			r = new BufferedReader(new InputStreamReader(in));
			st = new StreamTokenizer(r);
		}

		public String next() {
			nextToken();
			return st.sval;
		}


		public int nextInt() {
			nextToken();
			return (int)st.nval;
		}

		public long nextLong() {
			nextToken();
			return (long)st.nval;
		}

		private int nextToken() {
			int token = st.TT_EOF;
			try {
				token = st.nextToken();
			} catch (IOException e) {
			}
			return token;
		}
	}
}
