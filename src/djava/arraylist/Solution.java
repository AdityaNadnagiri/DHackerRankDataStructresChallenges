package djava.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number Of Lines");
		int n=input.nextInt();
		ArrayList<ArrayList<Integer>> aL=new ArrayList<>();
		for(int i=0;i<n;i++) 
		{
			System.out.println("Number Of Elements In "+(i+1)+" Line");
			int d=input.nextInt();
			ArrayList<Integer> a=new ArrayList<>();
			System.out.println("Enter "+d+" Elements of Line "+(i+1));
			for(int j=0;j<d;j++) 
			{
			
				a.add(input.nextInt());
			}
			aL.add(a);
		}
		System.out.println(aL);
		System.out.println("Enter The Number Of Queries");
		int q=input.nextInt();
		for(int k=0;k<q;k++) 
		{
			System.out.println("Enter The Line And Position Of Query "+(k+1));
			int x=input.nextInt();
			int y=input.nextInt();
			if (x<=n&&y<=(aL.get(x-1).size())) 
			{
			System.out.println("Line "+y+" Element "+x+" is "+aL.get(x-1).get(y-1));
			}else 
			{
				System.out.println("ERROR!");
			}
		}
		input.close();

	}

}
