package com.spoj;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test1840 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 0; t < T; t++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			Queue<Integer> q = new LinkedList();
			int[] lv = new int[n];
			int count = 1;
			for (int i = 0; i < n; i++) {
				lv[i] = scan.nextInt();
			}

			for (int i = 0; i < n; i++) {
				if (i == m) {
					q.add(-1);
					continue;
				}
				if (lv[i] >= lv[m]) {
					if (!compare(lv, lv[i])) {
						count++;
					} else
						q.add(lv[i]);
				}
			}

			while (q.peek() > 0)
				count++;

			System.out.println(count);

		}
		scan.close();
	}

	public static boolean compare(int[] lv, int x) {
		int check = 0;
		for (int i = 0; i < lv.length; i++) {
			if (x < lv[i]) {
				check++;
				break;
			}
		}
		if (check == 0)
			return true;
		else
			return false;
	}

}
