package manager.repository;


import java.sql.SQLException;
import java.util.List;
import manager.entity.Student;

public interface repository {
	
	List<Student> selectAllStudents() throws SQLException;
	
	Student selectStudent(int stdNo) throws SQLException;
	
	
	
	boolean registStudent(Student student) throws SQLException;
	
	int updateStudent(int stdNo, Student student) throws SQLException;
	
	boolean deleteStudent(int stdNo) throws Exception;

}
