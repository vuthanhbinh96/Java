package com.algorithms;

import java.util.Scanner;

public class QuickSort {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Swap sw = new Swap();
		int a = scan.nextInt();
		int b = scan.nextInt();
		sw.swap(a, b);
		System.out.println(a + " " + b);
	}

}

class Swap {
	int a,b;
	public void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	};
}