package com.spoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test16579 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		ArrayList<Integer> N = new ArrayList();
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			N.add(scan.nextInt());
		}
		Collections.sort(N);

		for (int i = 0; i < n; i++) {
			temp[i] = N.get(i);
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (Arrays.binarySearch(temp, temp[i] + k) > -1)
				count++;
		}
		System.out.println(count);

		scan.close();
	}

}
