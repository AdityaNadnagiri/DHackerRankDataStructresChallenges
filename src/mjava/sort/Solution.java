package mjava.sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
	 public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Student> studentList = new ArrayList<Student>();
	      while(testCases>0){
	         Student st = new Student(in.nextInt(), in.next(), in.nextDouble());
	         studentList.add(st);
	         testCases--;
	      }
	      in.close();
	      Compare compare=new Compare();
	      Collections.sort(studentList, compare);
	         for(Student st: studentList){
	         System.out.println(st.getFname());
	      }
	   }
	 

}
