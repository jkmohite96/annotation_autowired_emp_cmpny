package spring.annotation_autowired_emp_cmpny;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "cmpny1")
	public Company getCompany() {
		Company cmp1 = new Company();
		cmp1.setName("Infosys");
		cmp1.setLocation("Hinjewadi");
		return cmp1;
	}

	@Bean( name = "cmp")
	public Company getcmpny()
	{
		Company cmp = new Company();
		cmp.setName("Capgemini");
		cmp.setLocation("Talawade");
		return cmp;
	}
	
	
	@Bean
	public Employee getEmployee() {
		Employee emp = new Employee();
		return emp;
	}

	/*@Bean(name = "emp22")
	public Employee getemp()
	{
		Employee e = new Employee();
		return e;
	}*/
	
}
