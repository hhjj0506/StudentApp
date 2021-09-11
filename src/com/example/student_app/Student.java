package com.example.student_app;

public class Student implements Comparable<Student> {
	int no;
	String name;
	int age;
	
	public Student(int i, String string, int j) {
		this.no = i;
		this.name = string;
		this.age = j;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
		// return Integer.valueOf(age).compareTo(o.age);
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
}
