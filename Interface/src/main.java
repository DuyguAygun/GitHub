
public class main {

	public static void main(String[] args) {
		ICustomerDal customerDal=new OracleCustomerDal(); 
		customerDal.Add();
		MySqlCustomerDal customerDal1=new MySqlCustomerDal();
		customerDal1.Add();
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		customerManager.Add();
	}
}
