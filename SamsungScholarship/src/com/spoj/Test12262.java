package com.spoj;

import java.util.Scanner;

public class Test12262 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		String[] str = new String[t];
		int leng, leng_sub, numAnswer;
		boolean finish;
		for (int tc = 0; tc < t; tc++) {
			str[tc] = scan.nextLine();
			char[] c = str[tc].toCharArray();
			leng = c.length;
			leng_sub = leng;

			while (true) {
				numAnswer = 0;
				finish = false;
				for (int i = 0; i < leng; i++) {
					if (i + leng_sub > leng)
						break;
					if (leng_sub == 1 || (leng_sub == 2 && c[i] == c[i + 1])) {
						numAnswer++;
						finish = true;
					} else {
						boolean check = true;
						for (int j = 0; j <= (leng_sub - 1) / 2; j++) {
							if (c[j + i] != c[leng_sub - 1 - j + i]) {
								check = false;
								break;
							}
						}
						if (check == true) {
							numAnswer++;
							finish = true;
						}
					}
				}
				if (finish == true)
					break;
				if (leng_sub == 1)
					break;
				leng_sub--;
			}
			System.out.println(leng_sub + " " + numAnswer);

		}
		scan.close();

		// for (int tc = 0; tc < t; tc++) {
		// int leng = str[tc].length();
		// int count = 0;
		// for (int space = leng - 1; space >= 0; space--) {
		// for (int i = 0; i < leng - space; i++) {
		// String temp1 = str[tc].substring(i, i + space + 1);
		// StringBuilder s = new StringBuilder(temp1);
		// String temp2 = s.reverse().toString();
		// if (temp1.compareTo(temp2) == 0)
		// count++;
		// }
		// if (count != 0) {
		// System.out.println(space + 1 + " " + count);
		// break;
		// }
		// }
		// }

		// Scanner scan = new Scanner(System.in);
		// int T, length, len_sub, numAnswer;
		// boolean finish;
		// int t = Integer.parseInt(scan.nextLine());
		//
		// for (int i = 0; i <= t; i++) {
		// String[] str = new String[200];
		// char[] a = new char[3000];
		// str[i] = scan.nextLine();
		// a = str[i].toCharArray();
		// length = str[i].length();
		// len_sub = length;
		//
		// while (true) {
		// numAnswer = 0;
		// finish = false;
		// for (int j = 0; j < length; j++) {
		// if (j + len_sub > length)
		// break;
		// if (len_sub == 1 || (len_sub == 2 && a[j] == a[j + 1])) {
		// numAnswer++;
		// finish = true;
		// } else {
		// boolean check = true;
		// for (int y = 0; y <= (len_sub - 1) / 2; y++)
		// if (a[y+j] != a[len_sub - 1 - y +j]) {
		// check = false;
		// break;
		// }
		// if (check == true) {
		// numAnswer++;
		// finish = true;
		// }
		// }
		// }
		// if(finish == true) break;
		// if(len_sub==1) break;
		// len_sub--;
		// }
		//
		// System.out.println(len_sub+" "+numAnswer);
		//
		// }

	}

}
