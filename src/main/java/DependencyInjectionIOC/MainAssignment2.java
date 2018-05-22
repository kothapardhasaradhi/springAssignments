package DependencyInjectionIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAssignment2 {

	public static void main(String[] args) {
		ApplicationContext applCtx = new ClassPathXmlApplicationContext("DependencyInjectionIOC-Config.xml");
		
		System.out.println(applCtx.getBean("Kohli").toString());
		System.out.println(applCtx.getBean("Dhoni").toString());
		System.out.println(applCtx.getBean("Rohit").toString());
		System.out.println(applCtx.getBean("ABD").toString());
		System.out.println(applCtx.getBean("FAF").toString());
		
		
	}

}
