package org.college;

public class College extends Student{

	public void collegeName() {
		System.out.println("PSR Engg College");
	}
	public void collegeCode() {
		System.out.println("4569");

	}
	public void collegeRank() {
		System.out.println("15th");
	}
	public static void main(String[] args) {
		
		College c = new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		
		Student s = new Student();
		s.studentName();
		s.studentId();
		s.studentDept();
		
		Hostel h = new  Hostel();
		h.hostelName();
		
		Dept d = new Dept();
		d.deptName();
		
	}

}
