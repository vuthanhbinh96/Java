package spoj;

import java.util.Scanner;

public class Find_String_Roots {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int MAX = 100001;
		while (true) {
			char[] str = new char[MAX];
			String s = new String();
			s = scan.nextLine();
			str = s.toCharArray();
			if (str[0] == '*')
				break;
			int leng = str.length;
			boolean result = false;
			int root;
			for (root = 1; !result && root < leng; root++) {
				if (leng % root == 0) {
					result = true;
					for (int i = 0; result && i < root; i++) {
						for (int j = root; result && j < leng; j += root) {
							if (str[i] != str[i + j])
								result = false;
						}
					}
				}
			}
			System.out.println(leng / (root - 1));

			// int leng_sub = 1;
			// int N = 0;
			//
			// while (true) {
			// if (leng % leng_sub != 0) {
			// leng_sub++;
			// continue;
			// }
			//
			// int id = 0;
			// boolean check = true;
			// while (true) {
			// if (id + leng_sub + 1 > leng)
			// break;
			// for (int i = 0; i < leng_sub; i++) {
			// if (str[i + id] != str[i + leng_sub + id]) {
			// check = false;
			// break;
			// }
			// }
			// if (check == false)
			// break;
			// id += leng_sub;
			// }
			// if (check == true) {
			// N = leng / leng_sub;
			// break;
			// }
			// leng_sub++;
			// }
			// System.out.println(N);
		}

		// while (true) {
		// String str = scan.nextLine();
		// int result = 0;
		// int leng = str.length();
		// int leng_sub = 1;
		// int range;
		// boolean next = true;
		// if (str.compareTo("*") == 0 && leng == 1)
		// break;
		// while (true) {
		//
		// if (leng % leng_sub != 0) {
		// leng_sub++;
		// continue;
		// }
		// range = leng / leng_sub;
		//
		// for (int i = 0; i < range - 1; i++) {
		// int j = leng_sub;
		// String s1 = str.substring(0, leng_sub);
		// String s2 = str.substring(j, j + leng_sub);
		// if (s1.compareTo(s2) != 0)
		// next = false;
		// j += leng_sub;
		// }
		// leng_sub++;
		// if (next == false)
		// continue;
		// else {
		//
		// result = range;
		// break;
		// }
		//
		// }
		// System.out.println(result);
		// }

	}

}
