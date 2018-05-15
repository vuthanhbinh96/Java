package spoj;

import java.util.Scanner;

public class Rectangles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int h;
		int count = 0;
		for (h = 1; h <= n / h; h++) {
			for(int i = h; i <= n/h; i ++) {
				count++;
			}
		}
		System.out.println(count);
	}

}
