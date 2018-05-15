package com.spoj;

import java.util.Scanner;

public class Test31214 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i<t;i++) {
			int a = scan.nextInt();
			System.out.println(checkMaxPrime(a));
		}
		
	}

	public static int checkMaxPrime(int N) {
		int i;
		for (i = N; 1<N; i--) 
			if (checkPrime(i)) {
			
				break;
			}
		return i;
	}

	public static boolean checkPrime(int i) {
		if (i > 2 && i % 2 == 0 || i <= 1)
			return false;
		for (int j = 3; j <= Math.sqrt(i); j += 2) {
			if (i % j == 0)
				return false;
		}
		return true;
	}
}
