package program;

public class Customer {
	public Customer() {
		System.out.println("musteri nesnesi baslatildi");
	}//customer classını new lwdigimiz zaman bu blok devreye girer
	
	public int Id;
	public String City;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
}
