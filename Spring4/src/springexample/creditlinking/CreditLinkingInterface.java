package springexample.creditlinking;

import springexample.domain.ICustomer;

public interface CreditLinkingInterface {
	
	public String getUrl();
	
	public void setUrl(String url);
	
	public void linkCreditBankAccount(ICustomer icustomer) throws Exception ;

}
