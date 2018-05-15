package com.spoj;

import java.util.Scanner;

public class Test15708 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i =0;i<t;i++) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			checkDivisibility(n, x, y);
		}
	}
	
	public static void checkDivisibility(int n, int x, int y) {
		int a = x;
		while(n>x) {
			if(x%y!=0)
				System.out.println(x);
			x+=a;
		}
	}
}
