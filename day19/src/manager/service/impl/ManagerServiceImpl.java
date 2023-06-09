package manager.service.impl;

import manager.entity.Student;
import manager.service.ManagerService;
import manager.repository.Repository;
import manager.repository.impl.CollectionRepository;
import manager.repository.impl.DBRepository;

import java.util.List;

public class ManagerServiceImpl implements ManagerService {

	//-- Repository 객체 생성 
	//-- 불변객체 
	//private final Repository repository = new DBRepository(); 
	private final Repository repository = new CollectionRepository(); 
	
    @Override
    public Student registerStudent(Student student) throws Exception {
    	
    	Student resultStudent = null;
    	if(repository.registStudent(student)); {
    		resultStudent = repository.lastInsertedStudent();
    		
    	} 
        return resultStudent;
    }

    @Override
    public Student modifyStudent(Student student) throws Exception {
    	
    	int affactedRows = repository.updateStudent(student.getStdNo(), student);
    	if(affactedRows > 0) {
	           return student;
	    } else {
	    	return null;
	    }
	}

    @Override
    public List<Student> searchStudents(Student student) throws Exception {
    	
    	List<Student> list  = null; 
    	
    	if( student == null ) { 
        	// 조건 1. 전체를 조회한다 
    		list = repository.selectStudents();
    	} else if(student.getName() != null) {
	    	// 조건 2. 학생이름을 검색어로 조회한다. 
	    	list = repository.selectStudent(student.getName());
    	} else {
	    	list = List.of(repository.selectStudent(student.getStdNo()));
    	}
    	
        return list;
    }

    @Override
    public boolean deleteStudent(int stdNo) throws Exception {
        return repository.deleteStudent(stdNo);
    }

    @Override
    public void closeService() throws Exception {
    	repository.closeRepository();

    }
}