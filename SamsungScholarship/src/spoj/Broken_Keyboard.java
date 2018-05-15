package spoj;

import java.util.Scanner;

public class Broken_Keyboard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(scan.nextLine());
			if (n == 0)
				break;
			String str = scan.nextLine();
			int leng = str.length();
			if (n == 1) {
				int result = 1;
				for (int i = 0; i < leng - 1; i++) {
					int max = 1;
					for (int j = i + 1; j < leng; j++) {
						String s1 = str.valueOf(str.charAt(i));
						String s2 = str.valueOf(str.charAt(j));
						if (s1.compareTo(s2) == 0) {
							max++;
						} else
							break;
					}
					if (result < max)
						result = max;
				}
				System.out.println(result);
			} else {
				int cs = leng + 1 - n;
				int result = 0;
				for (int i = 0; i < cs; i++) {
					int j = i;
					int temp = n;
					int count = 0;
					String s = "";
					while (j < temp + i + count) {
						String sub = str.valueOf(str.charAt(j));
						if (s.indexOf(sub) < 0) {
							s += sub;
						} else {
							count++;
						}
						j++;
					}
					if (result < count) {
						result = count;
					}
				}

				System.out.println(result + n);
			}

		}
	}

}
