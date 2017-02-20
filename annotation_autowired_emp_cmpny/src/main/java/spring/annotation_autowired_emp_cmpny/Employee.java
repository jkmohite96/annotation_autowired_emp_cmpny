package spring.annotation_autowired_emp_cmpny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	
	private Company cmp;

	public Company getCmp() {
		return cmp;
	}


	@Autowired
	@Qualifier("cmp")
	public void setCmp(Company cmp) {
		this.cmp = cmp;
	}
}
