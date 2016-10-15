import java.util.*;
import java.io.*;

public class Main implements Runnable{
	public static int[] CountingSort(int[] A, int k){
		int n = A.length;
		int[] B = new int[n];
		int[] C = new int[k];
		for (int i = 0; i < n; i++) {
			C[A[i]]++;
		}
		for (int i = 1; i < k; i++) {
			C[i] += C[i - 1];
		}
		for (int j = n - 1; j >= 0; j--) {
			B[C[A[j]] - 1] = A[j];
			C[A[j]]--;
		}
		return B;	
	}
	public void run() {
		FastScanner sc = new FastScanner();
		int k = (int)sc.nextLong();
		int[] A = new int[k];
		for (int i = 0; i < k; i++) {
			A[i] = (int)sc.nextLong();
		}
		int[] B = CountingSort(A, 10001);
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < k; i++) {
			ans.append(B[i]);
			if (i == k - 1) {
				ans.append("\n");
			} else {
				ans.append(" ");
			}
		}
		System.out.print(ans);
	}
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 128*1024*1024).start();
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	public boolean hasNext() { skipUnprintable(); return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}
