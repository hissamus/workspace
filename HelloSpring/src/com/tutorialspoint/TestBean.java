package com.tutorialspoint;

import org.springframework.beans.factory.InitializingBean;

public class TestBean implements  InitializingBean {
	private String message;
	public TestBean()
	{
		
	}
	

	   public void setMessage(String message){
	      this.message  = message;
	   }

	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   
	   public void init()
	   {
		   System.out.println(this.hashCode()+" :init-method called");
	   }
	   
	   public void destroy()
	   {
		   System.out.println(this.hashCode()+" :destroy-method called");
	   }


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.hashCode()+" :afterPropertiesSet() called");
	}
}
