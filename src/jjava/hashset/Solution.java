package jjava.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];
		for (int i = 0; i < t; i++) {
			pair_left[i] = input.next();
			pair_right[i] = input.next();
		}
		 HashSet<String> hashSet = new HashSet<>(); 
	        for(int j=0;j<t;j++) 
				{
					String str=pair_left[j]+":"+pair_right[j];
					hashSet.add(str);
					System.out.println(hashSet.size());
				}

		input.close();

	}

}
