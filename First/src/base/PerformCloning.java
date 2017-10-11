package base;

public class PerformCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p = new Person("1", "2", "3", new Company("yash", "345", new Employee(1)));
		System.out.println(p.hashCode());
		Person p2 = (Person) p.clone();
		System.out.println(p.hashCode());
		p2.getCompany().setAddress("new address");
		System.out.println(p.getCompany().getAddress());

	}
}