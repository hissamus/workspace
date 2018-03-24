package springexample.domain;

//Interface holds customer information.
public interface ICustomer {

	public String getCustomerId();

	public void setCustomerId(String customerId);

	public String getFirstName();

	public void setFirstName(String firstName);

	public IAddress getIAddress();

	public void setIAddress(IAddress address);

	public String getLastName();

	public void setLastName(String lastName);

	public String getSsnId();

	public void setSsnId(String ssnId);
	
	
	public String getEmailAddress();
	

	public void setEmailAddress(String emailAddress);
	
	
	public boolean isCreditRating() ;
	

	public void setCreditRating(boolean creditRating);
	

}
