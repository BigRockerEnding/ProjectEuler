package org.wintresstech.seh.euler;

public class Problem2 {
	public static void main(String[] args) {
		int result = new Problem2().solve();
		System.out.println(result);
	}
	
	public int solve() {
		int a = 1, b = 1, result = 0;
		while (b <= 4000000) {
			if (b % 2 == 0) {
				result += b;
			}
			int temp = a;
			a = b;
			b += temp;
		}
		return result;
	} 
}
