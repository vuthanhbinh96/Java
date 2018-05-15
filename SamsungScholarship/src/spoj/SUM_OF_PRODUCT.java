package spoj;

import java.util.Scanner;

public class SUM_OF_PRODUCT {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mod = 1000000007;
		int t = scan.nextInt();

		for (int tc = 0; tc < t; tc++) {
			int n = scan.nextInt();
			long sum = 0;
			int x;
			for (x = 1; x * x <= n; x++) {
				sum = (sum + (x * (n / x)) % mod) % mod;
			}
			x--;

			for (int i = 1; i < n / x; i++) {
				long a = n / i;
				long b = n / (i + 1);
				long diff = a * (a + 1) / 2 - b * (b + 1) / 2;
				sum = (sum + (diff * i) % mod) % mod;
			}

			System.out.println(sum);
		}
	}

}
