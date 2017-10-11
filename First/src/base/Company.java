package base;

public class Company {

	public Company(String name, String address,Employee employee) {
		super();
		this.name = name;
		this.address = address;
		this.employee=employee;
	}

	String name;
	
	String address;

	Employee employee;
	
	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
