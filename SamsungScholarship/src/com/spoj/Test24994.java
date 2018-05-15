package com.spoj;

import java.util.Scanner;

public class Test24994 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] arr = new int[10];
		int i = 0;
		int x = 0;
		while (a > 0) {
			arr[i++] = a % 10;
			a = a / 10;
		}
		for(int j = 0;j<i;j++) {
			x+=arr[j];
		}
		if(x%10!=9) System.out.println("NO");
		else System.out.println("YES");
	}
}
