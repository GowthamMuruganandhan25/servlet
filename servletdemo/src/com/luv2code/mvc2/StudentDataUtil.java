package com.luv2code.mvc2;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents()
	{
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("marry","public","marry@gmailc.om"));
		students.add(new Student("marry","public","marry@gmailc.om"));
		students.add(new Student("marry","public","marry@gmailc.om"));
		
		
        return students;
		
		
		
		
	}

}
