package in.st.service;

import java.util.List;

import in.st.model.Student;

public interface StudentService {

	Student addStudent(Student student);
	
	List<Student> getAllStudentList();
	
	Student getStudent(Integer Id);
	
	String deleteStudent(Integer Id);
	
}
