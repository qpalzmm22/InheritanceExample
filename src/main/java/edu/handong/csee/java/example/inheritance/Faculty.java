package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person {
	private int facultyNumber; 
	
	public Faculty() {
		super();
		facultyNumber = 0;
	}
	public Faculty(String initialName, int initialNumber)    { 
		super(initialName);
		facultyNumber = initialNumber;
	}
	public void reset(String newName, int newFacultyNumber) {
		super.setName(newName);
		facultyNumber = newFacultyNumber;
	}
	
	public int getFacultyNumber() {
		return this.facultyNumber;
	} 
	
	public void setFacultyNumber(int newFacultyNumber) {
		facultyNumber = newFacultyNumber;
	}

	public void writeOutput() {
		super.writeOutput();
		System.out.println("Faculty Num: " + facultyNumber);
	} 

	public boolean equals(Faculty otherFaculty) {
		return (super.hasSameName(otherFaculty) && this.facultyNumber == (otherFaculty.facultyNumber));
	} 
	
}
