package pjava.bitset;

public class Student {
	private String name;
	private int id;
	private double cgpa;
	Student(String name,double cgpa,int id){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		
	}
	int getID(){
		return id;
	}
	String getName(){
		return name;
	}
	double getCGPA(){
		return cgpa;
	}
}
