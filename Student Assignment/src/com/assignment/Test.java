package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.assignment.*;

public class Test {

	public static void main(String[] args) {
		List<Student> studentList= new ArrayList<>();
		studentList.add(new Student(10,"Adarsh",100));
		studentList.add(new Student(1,"Vedant",40));
		studentList.add(new Student(11,"Om",90));
		studentList.add(new Student(13,"Harsh",55));
		studentList.add(new Student(3,"Rajat",80));
		
		System.out.println("Before Sort: ");
		for(Student ele:studentList)
			System.out.println(ele);
		
		System.out.println("After Natural Ordering: ");
		Collections.sort(studentList);
		for(Student ele:studentList)
			System.out.println(ele);
		
		System.out.println("Sorting on Student name: ");
		
		class StudentNameComparator implements Comparator<Student>{
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}
		
		Comparator<Student> studentNameComparator = new StudentNameComparator();
		Collections.sort(studentList, studentNameComparator);
		
		for(Student ele:studentList)
			System.out.println(ele);
		
		Student s= new Student();
		s.setRollno(10);
		if(studentList.contains(s))
			System.out.println("Student exists");
		else
			System.out.println("Student not found");
		
	}

}
