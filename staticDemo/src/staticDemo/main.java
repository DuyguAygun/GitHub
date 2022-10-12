package staticDemo;

public class main {

	public static void main(String[] args) {
	ProductManager manager =new ProductManager();
	Product product=new Product();
	product.name="fare";
	product.price=100;
	manager.add(product);
	
	DatabaseHelper.Crud.Delete();
	DatabaseHelper.Connection.createConnection();
	}

}
