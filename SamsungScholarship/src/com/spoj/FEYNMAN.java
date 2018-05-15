package com.spoj;

import java.util.Scanner;

public class FEYNMAN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int N = scan.nextInt();
			if (N == 0)
				break;
			int count = 0;
			for (int x = 0; x < N; x++) {
				for (int y = 0; y < N; y++) {
					count++;
					for (int i = 1; i < N; i++) {
						if (x + i < N && y + i < N)
							count++;

					}
				}
			}
			System.out.println(count);
		}
	}

}
