package springexample.creditcardaccount;

import springexample.creditlinking.CreditLinkingInterface;
import springexample.creditrating.CreditRatingInterface;
import springexample.domain.ICustomer;
import springexample.email.EmailInterface;

public interface CreateCreditCardAccountInterface {

	public CreditLinkingInterface getCreditLinkingInterface();

	public void setCreditLinkingInterface(
			CreditLinkingInterface creditLinkingInterface);

	public CreditRatingInterface getCreditRatingInterface();

	public void setCreditRatingInterface(
			CreditRatingInterface creditRatingInterface);

	public EmailInterface getEmailInterface();

	public void setEmailInterface(EmailInterface emailInterface);

	public void createCreditCardAccount(ICustomer icustomer) throws Exception;

}
