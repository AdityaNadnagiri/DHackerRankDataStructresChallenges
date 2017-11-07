package ejava.Array1dpart2;

import java.util.*;
public class Solution {
	public static boolean win(int leap, int[] game) {
		int i=0;
		ArrayList<Integer> aL=new ArrayList<Integer>();
		if(i==0&&i+leap<game.length) {
		if((game[i+1]!=0&&game[i+leap]!=0)||leap==0) {return false;}}
		else if(i+leap>=game.length) {return true;}
		try {while(i<game.length) {
			if(game[i+leap]==0&&!aL.contains(i+leap)) {
				i=i+leap;
				aL.add(i);
				if(i+leap>=game.length) {
					return true;
				}
		}else if(game[i+1]==0&&!aL.contains(i+1)) {
			
				i=i+1;
				aL.add(i);
				if((i+1)>=game.length) {
					return true;
				}
			
		}
		
		else if(game[i-1]==0&&!aL.contains(i-1)) {
			
				i=i-1;
				aL.add(i);
				if(i+leap>=game.length) {
					return true;
				}
			
		} else {
			return false;
		} 
		}
	}catch (Exception e) {
		if (i+leap>=game.length||i+1>=game.length) {return true;}
		else {
			return false;
		}
	}
		
		return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int queries = input.nextInt();
		for (int i = 0; i < queries; i++) {
			int n = input.nextInt();
			int[] game = new int[n];
			int leap = input.nextInt();
			for (int j = 0; j < n; j++) {
				game[j] = input.nextInt();
			}
			System.out.println(win(leap, game)?"YES":"NO");
		}
		input.close();
	}
}