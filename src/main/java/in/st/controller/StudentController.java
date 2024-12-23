package in.st.controller;

import java.util.List;

import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.st.model.Student;
import in.st.service.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@PostMapping("/save")
	public ResponseEntity<Student> SaveStudent(@RequestBody Student student){
		Student student2 = studentServiceImpl.addStudent(student);
		return new ResponseEntity<Student>(student2, HttpStatus.CREATED);
	}
	
	@GetMapping("/id/{Id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer Id){
		Student student = studentServiceImpl.getStudent(Id);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	

	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> allStudentList = studentServiceImpl.getAllStudentList();
		return new ResponseEntity<List<Student>>(allStudentList, HttpStatus.OK);
	}
	
	@DeleteMapping("/id/{Id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer Id){
		String deleteStudent = studentServiceImpl.deleteStudent(Id);
		return new ResponseEntity<String>(deleteStudent, HttpStatus.OK);
	
	}
	
}
