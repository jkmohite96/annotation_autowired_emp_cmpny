package spring.annotation_autowired_emp_cmpny;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo {
	
	public static void main(String[] args) {
		
	ApplicationContext  ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	
	Employee emp = ctx.getBean(Employee.class);
	
	System.out.println(emp.getCmp().getName());
	System.out.println(emp.getCmp().getLocation());
	
	}
	

}
