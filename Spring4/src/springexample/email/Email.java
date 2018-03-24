package springexample.email;

import springexample.domain.ICustomer;

public class Email implements EmailInterface {

	private String smtpHost;
	
	private String userId;
	
	private String password;
	
	private String fromEmail;
	
	public void sendEmail(ICustomer iCustomer){
		
		System.out.println("Email sent for customer id "+iCustomer.getCustomerId());
	}

	public String getFromEmail() {
		return fromEmail;
	}
	

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	

	public String getPassword() {
		return password;
	}
	

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getSmtpHost() {
		return smtpHost;
	}
	

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}
	
	public String getUserId() {
		return userId;
	}
	

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
