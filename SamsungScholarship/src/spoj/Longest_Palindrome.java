package spoj;

import java.util.Scanner;

public class Longest_Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int N = 100000;
		String str = new String();
		char[] a = new char[N];
		char[] b = new char[2 * N];
		int n, m, c, r, res, j;
		int[] z = new int[N];

		m = Integer.parseInt(scan.nextLine());
		str = scan.nextLine();
		b[n = 1] = '#';
		for (int i = 0; i < m; i++) {
			b[++n] = (char) str.charAt(i);
			b[++n] = '#';
		}
		c = 1;
		r = 1;
		res = 0;
		for (int i = 2; i <= n; i++) {
			j = 2 * c - i;
			if (i < r)
				z[i] = Integer.min(z[j], r - i);
			while (b[i - 1 - z[i]] == b[i + 1 + z[i]])
				z[i]++;
			res = Integer.max(res, z[i]);
			if (i + z[i] > r) {
				c = i;
				r = i + z[i];
			}
		}
		System.out.println(res);
	}

}
