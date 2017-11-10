package ojava.bitset;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		BitSet b1=new BitSet(n);
		BitSet b2=new BitSet(n);
		b1.set(0);
		b1.set(0);
		b1.set(0);
		for(int i=0;i<n;i++) {
			b1.set(i,false);
			b2.set(i,false);
		}
		for(int i=0;i<m;i++) {
			String s=input.next();
			int a=input.nextInt();
			int b=input.nextInt();
			if(s.equals("AND")) {
				if(a==1&&b==2)
				{
					b1.and(b2);
				}else 
				{
					b2.and(b1);
				}
			}
			else if(s.equals("OR")) {
				if(a==1&&b==2)
				{
					b1.or(b2);
				}else 
				{
					b2.or(b1);
				}
			}
			else if(s.equals("XOR")) {
				if(a==1&&b==2)
				{
					b1.xor(b2);
				}else 
				{
					b2.xor(b1);
				}
			}
			else if(s.equals("FLIP")) {
				if(a==1)
				{
					b1.flip(b);
				}else 
				{
					b2.flip(b);
				}
			}
			else if(s.equals("SET")) {
				if(a==1)
				{
					b1.set(b);
				}else 
				{
					b2.set(b);
				}
			}
				System.out.println(b1.cardinality()+" "+b2.cardinality());
			
		}
		input.close();
			
	}

}