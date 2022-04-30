package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Raviselvan C");
	}
	
	public void studentDept() {
		System.out.println("ECE");
	}
	
	public void studentId() {
		System.out.println("Roll No : 53");
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}
}
