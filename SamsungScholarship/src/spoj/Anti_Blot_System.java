package spoj;

import java.util.Scanner;

public class Anti_Blot_System {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());

		for (int tc = 0; tc < t; tc++) {
			String str1 = scan.nextLine();
			String str2 = scan.nextLine();
			String str3 = scan.nextLine();
			int a = clear(str1);
			int b = clear(str2);
			int c;
			if(clear(str3)==0) {
				c = a+b;
			}
			else c = clear(str3);
			System.out.println(a + " + " + b + " = " + c);
		}

	}

	static int clear(String str) {

		int i = str.indexOf("machula");
		int leng = str.length();
		if(i>=0) {
			str = str.substring(0, i) + str.substring(i, leng);
		}
		return Integer.parseInt(str);
	}

}
