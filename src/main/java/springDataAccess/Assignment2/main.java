package springDataAccess.Assignment2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springDataAccess.Assignment2.GetDetails;
import springDataAccess.modal.Student;

public class main {
	public static void main(String[] args) {
		ApplicationContext applCtx = new ClassPathXmlApplicationContext("springDataAccessAssignment2-Config.xml");
		GetDetails getDetails = applCtx.getBean("proxy",GetDetails.class);
		getDetails.getAllDetails();
		getDetails.getDetails("S7");
	}
}
