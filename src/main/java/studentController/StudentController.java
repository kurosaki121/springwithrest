package studentController;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Student;
import studentService.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentservice;
	
	@RequestMapping("/StudentInfo")
	public Hashtable<String, Student> getAll() {
		return studentservice.getAll();
	}
}
