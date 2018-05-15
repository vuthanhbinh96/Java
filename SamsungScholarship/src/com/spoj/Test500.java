package com.spoj;

import java.util.ArrayList;
import java.util.Scanner;

public class Test500 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		int t = scan.nextInt();
		for(int i = 0;i<t;i++) {
			int a = scan.nextInt();
			al.add(a);
		}
		
		for(int i = 0;i<t;i++) {
			for(int j = i+1;j<t;j++) {
				int temp = 0;
				if(al.get(i)>al.get(j)) {
					temp = al.get(i);	
					al.set(i, al.get(j));
					al.set(j, temp);
				}			
			}
		}
		for(int i = 0;i<t;i++) {
			System.out.println(al.get(i));
		}
		
	}

}
