package springexample.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springexample.creditcardaccount.CreateCreditCardAccountInterface;
import springexample.domain.Customer;
import springexample.domain.ICustomer;

public class CreateCreditAccountClient {
	
	public static void main(String[] args){
	try
	 {
	System.out.println("CreateCreditAccountClient started");
   
    
    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {
        "springexample-creditaccount.xml"
    });
    
	System.out.println("Classpath loaded");
	
	ICustomer icustomer = new Customer();
	icustomer.setCustomerId("1A2B3C");
	icustomer.setEmailAddress("xxx@xx.com");
	icustomer.setFirstName("xxx");
	icustomer.setFirstName("yyy");
	
	CreateCreditCardAccountInterface creditCardAccount = (CreateCreditCardAccountInterface)
	appContext.getBean("createCreditCard");
	
	creditCardAccount.createCreditCardAccount(icustomer);
	
	System.out.println("CreateCreditAccountClient end");
	 }
	catch(Exception e){
		e.printStackTrace();
	}
	}

}
