package com.spring.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/getdata")
	public String getTest() {
		return "student data";
	}
	
	@GetMapping("/getlist")
	public List<String> getStudentData(){
		 List<String> list =new ArrayList();
		 list.add("10");
		 list.add("Akash");
		 list.add("Nagpur");
		 return list;
	}
	
	@GetMapping("/getStudent")
	public Student getStudentDetail() {
		Student student = new Student();
		return student;
		
	}
}
