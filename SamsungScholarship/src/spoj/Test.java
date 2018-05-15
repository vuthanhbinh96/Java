package spoj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);
	}

	public static boolean checkPrime(int i) {
		if ((i > 2 && i % 2 == 0) || i <= 1) {
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
