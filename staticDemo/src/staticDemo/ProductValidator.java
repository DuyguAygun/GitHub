package staticDemo;

public class ProductValidator {
	static {
		System.out.println("statik yapici blok calisti");
	}
	static {
		System.out.println("statik yapici blok calisti");
	}
	static {
		System.out.println("statik yapici blok calisti");
	}
	public ProductValidator() {
		System.out.println("yapıcı blok calisti");
	}
	
	public static boolean isValid(Product product)
	{
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else
		{
			return false;
		}
	
	}
	public void birsey()
	{
		
	}
}
