package org.wintresstech.seh.euler;

public class Problem4 {
	public static void main(String[] args) {
		Problem4 prob = new Problem4();
		int result = prob.solve(3);
		System.out.println(result);
		System.out.println(prob.isPalindromic(result));
	}
	
	public int solve(int numDigits) {
		int lower = (int) Math.pow(10, numDigits - 1);
		int upper = lower * 10;
		int max = 0;
		for (int i = lower; i < upper; i++) {
			for (int j = i; j < upper; j++) {
				int pro = i * j;
				if (isPalindromic(pro)) {
					if (pro > max) max = pro;
				}
			}
		}
		return max;
	}
	
	public boolean isPalindromic(int n) {
		String nStr = "" + n;
		return nStr.equals(reverse(nStr));
	}
	
	public static String reverse(String str) {
		char[] strForward = str.toCharArray();
		int len = strForward.length;
		char[] strBackward = new char[len];
		for (int i = 0; i < len; i++) {
			strBackward[i] = strForward[len - 1 - i];
		}
		return String.copyValueOf(strBackward);
	}
}
