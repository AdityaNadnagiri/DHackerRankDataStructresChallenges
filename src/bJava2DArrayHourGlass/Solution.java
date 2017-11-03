package bJava2DArrayHourGlass;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int max = 0, k = 0;
		System.out.println("THis problem takes multidimensional array and returns the max HourGlass");
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of ellements in the array");
		int n = input.nextInt();
		int[][] a = new int[n][n];
		System.out.println("enter the elements of the array");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = input.nextInt();
			}
		}
		input.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", a[i][j]);
			}

			System.out.println("\n");
		}
		 while(k<(n-2)) 
		   {
			  int l=0;
			  while(l<(n-2)) 
			  {
			      int temp = a[k][l]
                          +a[k][l+1]   
                          +a[k][l+2]
                          +a[k+1][l+1]    
                          +a[k+2][l]
                          +a[k+2][l+1]    
                          +a[k+2][l+2];
			      System.out.println(temp+" "+(k+1)+" "+(l+1));
		           if(temp>max) 
				  {
					 max=temp;
				  }
				    l++;
            }
		    	k++;
		   }		System.out.println(max);
	}

}
