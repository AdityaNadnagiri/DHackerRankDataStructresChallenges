package ljava.comparator;

import java.util.Arrays;
import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Player[] player = new Player[n];
		Checker checker = new Checker();
		for (int i = 0; i < n; i++) 
		{
			player[i] = new Player(input.next(), input.nextInt());
		}
		input.close();
		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) 
		{
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
		String[] s = new String[n];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = player[i].name;
		}

	}

}