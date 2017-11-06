package gJavaMap;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		HashMap<String, String> dir = new HashMap<>();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		for (int i = 0; i < n; i++) {
			String name = input.nextLine();
			String num = input.nextLine();
			dir.put(name, num);
		}
		while (input.hasNext()) {
			String s = input.nextLine();
			if (dir.get(s) == null) {
				System.out.println("Not found");
			} else {
				System.out.println(s + "=" + dir.get(s));
			}
		}
		input.close();
	}
}