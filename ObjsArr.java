package com.arrays.java;

// Programs for Array of Objects

class Student{
	int roll_no;
	String name;
	
	Student(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}
}
public class ObjsArr {
	
	public static void main(String args[]) {
		
		Student[] arr = new Student[5];
		
		arr[0] = new Student(1,"A");
		arr[1] = new Student(2,"B");
		arr[2] = new Student(3,"C");
		arr[3] = new Student(4,"D");
		arr[4] = new Student(5,"E");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Roll No." + " : " + arr[i].roll_no + " | " + "Name" + " : " + arr[i].name);
		}
		
	}

}
