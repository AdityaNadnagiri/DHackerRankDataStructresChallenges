package fJava.list;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(input.nextInt());
        }
        int q=input.nextInt();
        for(int i=0;i<q;i++){
        	String command=input.next();
            if(command.equals("Insert")) {
             	list.add(input.nextInt(), input.nextInt());
            }
            else{
            	list.remove(input.nextInt());
            }

        }
        for(Integer num:list)
        {
        	System.out.print(num+" ");
            
        }
        input.close();
        
     }
	

}