package mjava.sort;

import java.util.Comparator;

public class Compare implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		if (s1.getCgpa() == s2.getCgpa()) {
			return s1.getFname().compareTo(s2.getFname());
		} else {
			return (s1.getCgpa() > s2.getCgpa()) ? -1 : 1;
		}
	}

}
