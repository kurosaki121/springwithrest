package studentService;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Student;

@Service
public class StudentService {
	Hashtable<String, Student> students = new Hashtable<String, Student>();
	public StudentService() {
		Student s = new Student();
		s.setId("101");
		s.setFirstName("Rahul");
		s.setLastName("Reddy");
		s.setSubject("Programming");
		s.setMarks(90);
		students.put("101", s);
		
		s.setId("102");
		s.setFirstName("Shankar");
		s.setLastName("Phani");
		s.setSubject("Programming");
		s.setMarks(80);
		students.put("102", s);
	}
	public Student getStudent(String id) {
		if(students.containsKey(id))
			return students.get(id);
		else
			return null;
	}
	public Hashtable<String, Student> getAll(){
		return students;
	}
}
