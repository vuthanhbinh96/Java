package spoj;

import java.util.Scanner;
import java.util.Stack;

public class Seinfeld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<String> s = new Stack();
		int STT = 0;
		while (true) {
			String str = input.nextLine();
			if (str.length() > 2000 || str.length() % 2 != 0 || str.charAt(0) == '-')
				break;
			for (int i = 0; i < str.length(); i++) {
				String temp = str.valueOf(str.charAt(i));
				if (!s.isEmpty() && s.peek().compareTo("{") == 0 && temp.compareTo("}") == 0) {
					s.pop();
					continue;
				}
				s.push(temp);

			}
			int count = 0;
			while (!s.isEmpty()) {
				String temp = s.peek();
				s.pop();
				if (temp.compareTo(s.peek()) == 0)
					count++;
				else
					count += 2;
				s.pop();
			}
			STT++;
			System.out.println(STT + ". " + count);

		}

		input.close();
	}

}
