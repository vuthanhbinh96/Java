package com.spoj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for (int i = 0; i < cases; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			for (int j = a; j <= b; j++) {
				if (checkPrime(j))
					System.out.println(j);
			}

		}
	}

	public static boolean checkPrime(int i) {
		if ((i > 2 && i % 2 == 0) || i == 1) {
			return false;
		}

		for (int j = 3; j <= (int) Math.sqrt(i); j += 2) {

			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
