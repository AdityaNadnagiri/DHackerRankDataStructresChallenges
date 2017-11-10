package pjava.bitset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

final class Priorities {
	List<String> s = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	List<Student> student = new ArrayList<Student>();

	List<Student> getStudents(List<String> events) {
		this.s = events;
		Compare compare=new Compare();
		for (int i = 0; i < s.size(); i++) {
		
			if (s.get(i).equals("ENTER")) {
				student.add(new Student(input.next(), input.nextDouble(), input.nextInt()));
				} else if (s.get(i).equals("SERVED")) {
					Collections.sort(student,compare);
				}
			
		}
		
		return student;
	}
	class Compare implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			if(s1.getCGPA()==s2.getCGPA()) {
				if(s1.getName().equals(s2.getName())) {
					if(s1.getID()<s2.getID()){
						return -1;
					}else return 1;
				}else {
					return s1.getName().compareTo(s2.getName());
				}
			}else if(s1.getCGPA()>s2.getCGPA()) {
				return -1;
			}else  {
				return 1;
			}
			
		}
		
	}

}
