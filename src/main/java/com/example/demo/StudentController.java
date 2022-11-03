package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	static HashMap<String, List<Student>> ll=new HashMap<String,List<Student>>();
	static {
		ArrayList<Student> l=new ArrayList<Student>();
		l.add(new Student(1,"Hamza"));
		l.add(new Student(2,"Nicole"));
		l.add(new Student(3,"Mazhar"));
		l.add(new Student(4,"NICK"));
		
	ll.put("batch-1", l);
	 l=new ArrayList<Student>();
	 
	 	l.add(new Student(1,"Lan"));
		l.add(new Student(2,"Mahbubaa"));
		l.add(new Student(3,"Mustafa"));
		l.add(new Student(4,"Ramrio"));
		
		ll.put("batch-3", l);
		
		 l=new ArrayList<Student>();
		 
		 	l.add(new Student(1,"JP"));
			l.add(new Student(2,"James"));
			l.add(new Student(3,"Harspreet"));
			l.add(new Student(4,"Badri"));
			ll.put("batch-4", l);
			
	}
	
	@GetMapping("/getStudentDetails/{batchName}")
	public ArrayList<Student> getStudentDetails(@PathVariable String batchName)
	{
		ArrayList<Student> al=(ArrayList<Student>) ll.get(batchName);
		
		if(al==null)
			return null;
		else
			return al;
		
	}
	
	

}
