package springDataAccess.Assignment2;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import springDataAccess.modal.Student;

public class GetDetails {
	

	StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void getAllDetails( ) {
		List<Student> studentList = studentDao.getAllDetails();
		
		studentList.forEach(student->System.out.println(student.toString()));
	}
	
	public void getDetails(String studentId){
		Student student= studentDao.getDetails(studentId);
		System.out.println(student.toString());
	}

}
