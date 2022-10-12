package polymorphisim;

public class main {

	public static void main(String[] args) {
//	EmailLogger logger=new EmailLogger();
//	logger.Log("log mesaji");
	
// 	BaseLogger[] loggers =new BaseLogger[] {new ConsoleLogger(), new FileLogger(),new EmailLogger(),new DataBaseLogger()};
//	for(BaseLogger logger:loggers) {
//      logger.Log("log mesajı");
//	}	
	CustomerManager customerManager =new CustomerManager(new FileLogger());
	customerManager.add();
	}
}
