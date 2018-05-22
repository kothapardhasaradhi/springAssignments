package springAOP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springAOP.modal.Student;

public class main {
	
	public static void main(String[] args) {
		ApplicationContext applCtx = new ClassPathXmlApplicationContext("springAOP-Config.xml");
		GetDetails getDetails = applCtx.getBean("proxy",GetDetails.class);
		List<Student> studentList = new ArrayList<Student>();
		for(int i=1;i<17;i++){
			String bean = "student"+i;
			studentList.add((Student) applCtx.getBean(bean));
		}
		getDetails.getAllDetails(studentList);
		getDetails.getDetails("S7", studentList);
	}

}
