package program;

public class Person extends Customer{
	public String FirstName;
	public String LatName;
	public String NationalIddenity;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLatName() {
		return LatName;
	}
	public void setLatName(String latName) {
		LatName = latName;
	}
	public String getNationalIddenity() {
		return NationalIddenity;
	}
	public void setNationalIddenity(String nationalIddenity) {
		NationalIddenity = nationalIddenity;
	}
	
}
