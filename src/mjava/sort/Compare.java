package mjava.sort;

import java.util.Comparator;

public class Compare implements Comparator {

	
	public int compare(Object o1, Object o2) {
		 	Student s1=(Student)o1;
		 	Student s2=(Student)o2;
		 	if(s1.getCgpa()==s2.getCgpa()) {
		 		return s1.getFname().compareTo(s2.getFname());
		 	}
		 	else {
		 		return (s1.getCgpa()>s2.getCgpa())?-1:1;
		 	}
	}

}
