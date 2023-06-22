package manager.repository.impl;

import java.sql.SQLException;
import java.util.List;

import manager.entity.Student;
import manager.repository.Repository;

public class CollectionRepository implements Repository {
	
	private static List<Student> student;
	private int stdNo = 0;
	
	public  CollectionRepository(){
		this.student = CollectionDBConnection
	}

	@Override
	public List<Student> selectStudents() throws SQLException {
		
		List<Student> student = student.stream()
				.filter(v -> v.getStdNo()== stdNo).collect(Collectors.toList());
		return student;
	}

	@Override
	public Student selectStudent(int stdNo) throws SQLException {
		return null;
	}

	@Override
	public List<Student> selectStudent(String name) throws Exception {
		return null;
	}

	@Override
	public Student lastInsertedStudent() throws Exception {
		return null;
	}

	@Override
	public boolean registStudent(Student student) throws SQLException {
		return false;
	}

	@Override
	public int updateStudent(int stdNo, Student student) throws SQLException {
		Student tagetStudent = this.selectStudent(stdNo);
		if(tagetStudent != null) {
			student
		}
		return 0;
	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		Student tagetStudent = this.selectStudent(stdNo);
		if(tagetStudent != null) {
			student.remove(stdNo - 1);
			return true;
		}
		return false;
	}

	@Override
	public void closeRepository() throws Exception {

	}
}
