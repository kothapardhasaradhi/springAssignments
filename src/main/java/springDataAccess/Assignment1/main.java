package springDataAccess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springDataAccess.GetDetails;
import springDataAccess.modal.Student;

public class main {
	public static void main(String[] args) {
		ApplicationContext applCtx = new ClassPathXmlApplicationContext("springDataAccess-Config.xml");
		GetDetails getDetails = applCtx.getBean("proxy",GetDetails.class);
		getDetails.getAllDetails();
		getDetails.getDetails("S7");
	}
}
