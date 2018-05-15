package com.spoj;

import java.util.Scanner;

public class Test95 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean check;
		int[] Stack = new int[1000];
		int[] Street = new int[1000];
		int stacksize;

		while (true) {
			int n = scan.nextInt();
			if (n == 0 || n > 1000)
				break;

			for (int i = 0; i < n; i++) {
				Street[i] = scan.nextInt();
			}

			check = true;
			stacksize = 0;
			int start = 1;

			for (int i = 0; i < n; i++) {
				while (stacksize > 0 && Stack[stacksize - 1] == start) {
					stacksize--;
					start++;
				}

				if (Street[i] == start)
					start++;
				else if (stacksize > 0 && Stack[stacksize - 1] < Street[i]) {
					check = false;
					break;
				} else {
					Stack[stacksize] = Street[i];
					stacksize++;
				}
			}
			if (check)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}
}
