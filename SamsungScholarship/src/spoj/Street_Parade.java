package spoj;

import java.util.Scanner;
import java.util.Stack;

public class Street_Parade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			int n = input.nextInt();
			if (n == 0 || n > 1000)
				break;
			int[] Street = new int[n];
			Stack<Integer> s = new Stack();
			for (int i = 0; i < n; i++) {
				Street[i] = input.nextInt();
			}
			int start = 1;
			boolean check = true;
			for (int i = 0; i < n; i++) {
				while (!s.isEmpty() && s.peek() == start) {
					s.pop();
					start++;
				}
				if (Street[i] == start)
					start++;
				else if (!s.isEmpty() && s.peek() < Street[i]) {
					check = false;
					break;
				} else
					s.push(Street[i]);
			}

			if (check)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

}
