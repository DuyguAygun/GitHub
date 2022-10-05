package inheritance;

public class main {

	public static void main(String[] args) {
		Customer customer =new Customer();
		System.out.println(customer.id);
		System.out.println(customer.firstName);
		System.out.println(customer.lastName);
		System.out.println(customer.age);
		System.out.println(customer.email);
		
		Employee employee=new Employee();
		System.out.println(employee.id);
		System.out.println(employee.firstName);
		System.out.println(employee.lastName);
		System.out.println(employee.age);
		System.out.println(employee.salary);
		
		EmployeeManager employeeManager =new EmployeeManager();
		CustomerManager customerManager=new CustomerManager();
		
	}

}
