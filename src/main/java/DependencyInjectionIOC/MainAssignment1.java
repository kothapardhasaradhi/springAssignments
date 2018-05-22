package DependencyInjectionIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DependencyInjectionIOC.modal.Student;

public class MainAssignment1 {

	public static void main(String[] args) {
		ApplicationContext applCtx = new ClassPathXmlApplicationContext("DependencyInjectionIOC-Config.xml");
		Student student1 = (Student) applCtx.getBean("student1");
		Student student2 = (Student) applCtx.getBean("student2");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		
	}
}
