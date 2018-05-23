package springDataAccess;

import org.aopalliance.intercept.MethodInterceptor;  
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor {

	 public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		 
		 Object obj;
		 System.out.println("*********************************************************************************");
		 System.out.println(methodInvocation.getMethod()+" is invoked at "+java.time.LocalDateTime.now());
		 long start = System.currentTimeMillis(); 
		 obj=methodInvocation.proceed();   
	     long end = System.currentTimeMillis();
	     System.out.println("Time taken by the method "+methodInvocation.getMethod()+" is:"+(end-start) +" milli seconds");
	     System.out.println("*********************************************************************************");
	     return obj;  
	}

}
