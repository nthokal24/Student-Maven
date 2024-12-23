package in.st.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.st.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
