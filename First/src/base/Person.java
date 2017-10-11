package base;

public class Person implements Cloneable{

	String name;
	
	String address;
	
	String salary;
	
	Company company;
	

	public Person(String name, String address, String salary,Company company) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.company=company;
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public Person clone() throws CloneNotSupportedException{
		
		return (Person) super.clone();
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}
