package springexample.creditcardaccount;

import springexample.creditlinking.CreditLinkingInterface;
import springexample.creditrating.CreditRatingInterface;
import springexample.domain.ICustomer;
import springexample.email.EmailInterface;

public class CreateCreditCardAccount implements CreateCreditCardAccountInterface {

	
	private CreditLinkingInterface creditLinkingInterface;
	private CreditRatingInterface creditRatingInterface;
	private EmailInterface emailInterface;
	
	

	public CreditLinkingInterface getCreditLinkingInterface() {
		return creditLinkingInterface;
	}
	

	public void setCreditLinkingInterface(
			CreditLinkingInterface creditLinkingInterface) {
		this.creditLinkingInterface = creditLinkingInterface;
	}
	

	public CreditRatingInterface getCreditRatingInterface() {
		return creditRatingInterface;
	}
	

	public void setCreditRatingInterface(CreditRatingInterface creditRatingInterface) {
		this.creditRatingInterface = creditRatingInterface;
	}
	

	public EmailInterface getEmailInterface() {
		return emailInterface;
	}
	

	public void setEmailInterface(EmailInterface emailInterface) {
		this.emailInterface = emailInterface;
	}
	
	
	public void createCreditCardAccount(ICustomer icustomer) throws Exception{
		boolean crediRating = getCreditRatingInterface().getUserCreditHistoryInformation(icustomer);
		icustomer.setCreditRating(crediRating);
		//Good Rating
		if(crediRating){
			getCreditLinkingInterface().linkCreditBankAccount(icustomer);
		}
		
		getEmailInterface().sendEmail(icustomer);
		
		
	}
	
}
