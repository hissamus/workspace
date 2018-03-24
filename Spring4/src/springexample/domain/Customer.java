package springexample.domain;

public class Customer implements ICustomer {

	
	// Existing Customer of bank
	private String customerId;

	// Customer Information
	private String ssnId;

	private String firstName;

	private String lastName;
	
	private String emailAddress;
	
	private boolean creditRating;

	// Address Information
	private IAddress iAddress;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public IAddress getIAddress() {
		return iAddress;
	}

	public void setIAddress(IAddress address) {
		iAddress = address;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsnId() {
		return ssnId;
	}

	public void setSsnId(String ssnId) {
		this.ssnId = ssnId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public boolean isCreditRating() {
		return creditRating;
	}
	

	public void setCreditRating(boolean creditRating) {
		this.creditRating = creditRating;
	}
	
	

}
