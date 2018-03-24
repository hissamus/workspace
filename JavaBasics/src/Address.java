
public class Address implements Cloneable{
	private String city;
	private int pin;
	
	public Address() {
		super();
	}
	public Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
