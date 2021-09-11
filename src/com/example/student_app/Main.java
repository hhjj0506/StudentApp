package com.example.student_app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		
		System.out.println("Student List (ordered by name)");
		al.add(new Student(101,"Kim",23));
		al.add(new Student(102,"Choi",21));
		al.add(new Student(103,"Park",25));
		al.add(new Student(104,"Lee",24));
		al.add(new Student(105,"Jung",21));
		al.add(new Student(106,"Ahn",22));
		al.add(new Student(107,"Yoo",27));
		al.add(new Student(108,"Song",29));
		al.add(new Student(109,"Won",31));
		al.add(new Student(110,"Choo",26));
		
		Collections.sort(al);
		
		for (Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
