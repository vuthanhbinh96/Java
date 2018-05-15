package com.spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class Test400 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y;
		while (true) {
			y = Integer.parseInt(scan.nextLine());
			if (y == 0)
				break;

			String s = scan.nextLine();
			char[] str = s.toCharArray();

			int x = s.length() / y;

			char[][] MT = new char[x][y];
			int a = 0;

			for (int i = 0; i < x; i++) {
				if (i % 2 == 0)
					for (int j = 0; j < y; j++) {
						MT[i][j] = str[a];
						a++;
					}
				else
					for (int j = y - 1; j >= 0; j--) {
						MT[i][j] = str[a];
						a++;
					}
			}

			for (int j = 0; j < y; j++) {
				for (int i = 0; i < x; i++) {
					System.out.print(MT[i][j]);
				}
			}
			System.out.println();
		}

	}

}
