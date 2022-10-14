package program;

public class main {

	public static void main(String[] args) {
		
//	CreditManager creditManager=new CreditManager();
//	creditManager.Calculate();
//	creditManager.save();
//	
//	Customer customer =new Customer();
//	customer.Id=1;
//	customer.City="Ankara";
//
//	
//	CustomerManager customerManager=new CustomerManager(customer);
//	customerManager.save();
//	customerManager.Delete();
//	
//	Company company =new Company();
//	company.TaxNumber="12345";
//	company.CompanyName="Arçelik";
//	company.Id=100;
//	CustomerManager customerManager2=new CustomerManager(new Person());
//	
//	Person person=new Person();
//	person.NationalIddenity="";
//	}
//	
//	Customer c1=new Customer();
//	Customer c2=new Person();
//	Customer c3=new Company();

		
		CustomerManager customerManager=new CustomerManager(new Customer(),new CarCreditManager());
		customerManager.GiveCredit();
		
	}		
}
