package ijava.stack;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	      
	      while (input.hasNext()) {
	    	  String s=input.next().replaceAll("[^\\(\\)\\[\\]\\{\\}]", "");
	    	    while(s.length() != (s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
	    	    System.out.println(s.isEmpty());
	      }
	      input.close();
	      
	}

}
