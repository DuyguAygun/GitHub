package program;

public class CustomerManager {
	
	
	private Customer _customer;
	ICreditManager _creditManager;
	public CustomerManager(Customer customer,ICreditManager creditManager) {
		_customer=customer;
		_creditManager=creditManager;
		
	}

	public void save() {
		System.out.println("musteri kaydedildi ");
	}
	public void Delete() {
		System.out.println("musteri silindi ");
	}
	public void GiveCredit()
	{
		_creditManager.calculate();
		System.out.println("kredi verildi");
	}
}
