package org.wintresstech.seh.euler;

public class Problem3 {
	public static void main(String[] args) {
		Problem3 prob = new Problem3();
		long result = prob.solve(600851475143L);
		System.out.println(result);
		System.out.println(prob.isPrime(result));
	}
	
	public long solve(long number) {
		for (int i = 3; ; i += 2) {
			if (i * i > number) return number;
			if (number % i == 0) {
				number /= i;
			}
		}
	}
	
	public boolean isPrime(long n) {
		int sqrt = (int) Math.sqrt(n);
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		for (int i = 3; i <= sqrt; i += 2) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
