package spring.annotation_autowired_emp_cmpny;

import org.springframework.beans.factory.annotation.Required;

public class Company {

	private String name;
	private String location;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
