package com.spoj;

public class Test526 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int count = 0;
			for (int j = 2; j <= (int) Math.sqrt(i); j++) {
				if (i % j != 0) {
					break;
				} else {
					if (Check(i / j)) {
						count++;
						break;
					}
				}
			}
			if (count == 0)
				System.out.println(i);
		}
	}

	public static boolean Check(int check) {
		if (check > 2 && check % 2 == 0 || check <= 1)
			return false;

		for (int i = 3; i <= (int) Math.sqrt(check); i++) {
			if (check % i == 0)
				return false;
		}

		return true;
	}

}
