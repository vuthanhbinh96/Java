package spoj;

import java.util.Scanner;
import java.util.Stack;

public class Transform_The_Expression {

	public int level(char c) {
		if (c == '+')
			return 1;
		if (c == '-')
			return 2;
		if (c == '*')
			return 3;
		if (c == '/')
			return 4;
		if (c == '^')
			return 5;
		return 0;
	}

	public boolean isOperator(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')')
			return true;
		return false;
	}

	public String Postfix(String str) {
		Stack<String> s = new Stack();
		String s1 = "";
		Transform_The_Expression T = new Transform_The_Expression();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (!T.isOperator(c))
				s1 += c;
			else if (c == '(')
				s.push(String.valueOf(c));
			else if (c == ')') {
				while (true) {
					if (s.peek().compareTo("(") == 0) {
						s.pop();
						break;
					} else {
						s1 += s.peek();
						s.pop();
					}
				}
			} else {
				while (!s.isEmpty() && T.level(s.peek().charAt(0)) >= T.level(c)) {
					s1 += s.peek();
					s.pop();
				}
				s.push(String.valueOf(c));
			}
		}
		while (!s.isEmpty()) {
			s1 += s.peek();
			s.pop();
		}
		return s1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = Integer.parseInt(input.nextLine());
		for (int tc = 0; tc < t; tc++) {
			String str = input.nextLine();
			Transform_The_Expression T = new Transform_The_Expression();
			System.out.println(T.Postfix(str));
		}
		input.close();
	}

}
