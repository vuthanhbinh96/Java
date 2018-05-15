package com.spoj;

import java.util.Scanner;

public class Test24967 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		checkSoPhongPhu(a);
		
	}
	
	public static void checkSoPhongPhu(int N) {
		int tong = 1;
		for(int i = 2; i<= N/2;i++) {
			if(N%i == 0) {
				tong+=i;
			}
		}
		if(tong <= N)
			System.out.println("0");
		else
			System.out.println("1");
	}
	
}
