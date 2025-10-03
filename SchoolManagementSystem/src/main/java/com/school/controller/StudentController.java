package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.school.entity.Student;
import com.school.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudentService service;
	
	/**1
	 * 1.show Register page 
	 * on enter /register URL
	 */
//	@RequestMapping(value="/register" ,method=RequestMethod.GET);
	@GetMapping("/register")
	public String showRegister() {
		return "StudentRegister";
	}

	/**2
	 * 1.this method will read FORM Data as ModelAttribute.
	 *  performs save() operations using service that returns ID generated.
	 *  Construct one message and to send UI using Model memory
	 *  On Entering URL :/save with TYPE : POST
	 */
//	@RequestMapping(value="/save",method=RequestMethod.POST)
	@PostMapping("/save")
	public String saveStudent(
			@ModelAttribute Student student,
			Model model) {
//		int id= service.saveStudent(student);
//		String message = String.format("Student '%id' saved",id);
//		String message = new StringBuffer().append("Student ' ").append(id).append(" ' Saved").toString();
//		String message = "Student ' "+id+" ' Saved";
//		model.addAttribute("message", message);
		return"StudentRegister";
	}
	
	/**3
	 * this method gets data from database by using service 
	 * and send to UI by using model memory . It is called when 
	 * PATH: /all with type GET is requested
	 */
	@GetMapping("/all")
	public String showAll(Model model) {
		//fetching data from service 
//		List<Student>list =service.getAllStudents();
//		//sending to UI
//		model.addAttribute("list",list);
		return "StudentData";
	}
}
