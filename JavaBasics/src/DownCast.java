
public class DownCast {

	public DownCast() {
		// TODO Auto-generated constructor stub
		
		Parent p = new Parent ( );
	      
		Child c = (Child) p; 
		c.show();
	}
	
	public static void main(String[] args) {
		DownCast d=new DownCast();
	}
	
	private class Parent
	{
		
		protected void show()
		{
			System.out.println("In Parent");
		}
		
	}
	
	private class Child extends Parent
	{
		protected void show()
		{
			System.out.println("In Child");
		}
		
	}

}
