package springAOP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springAOP.modal.Student;

public class GetDetails {

	public void getAllDetails(List<Student> studentList ) {
		
		
		studentList.forEach(student->System.out.println(student.toString()));
	}
	
	public void getDetails(String studentId,List<Student> studentList){
		studentList.forEach(student->{
								if(student.getStudentId().equalsIgnoreCase(studentId)){
									System.out.println(student.toString());
								}		
					});
	}

}
