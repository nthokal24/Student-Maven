package in.st.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.st.model.Student;
import in.st.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo studentRepo;
	
	
	@Override
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudentList() {
		return studentRepo.findAll();
	}

	@Override
	public Student getStudent(Integer Id) {
		return studentRepo.findById(Id).orElse(null);
	}

	@Override
	public String deleteStudent(Integer Id) {
		if(studentRepo.existsById(Id)) {
			studentRepo.deleteById(Id);
			return "Record Deleted";
		}
		else {
			return "Record Not found Deleted";
		}
	}

}
