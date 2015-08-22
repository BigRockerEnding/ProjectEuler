package org.wintresstech.seh.euler;

public class Problem5 {
	public static void main(String[] args) {
		Problem5 prob = new Problem5();
		long result = prob.solve();
		System.out.println(result);
	}
	
	public long solve() {
		long result = 1;
		for (int i = 1; i <= 20; i++) {
			result = lcm(result, i);
		}
		return result;
	}
	
	public long gcd(long a, long b) {
		if (a == 0) return b;
		return gcd(b % a, a);
	}
	
	public long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}
