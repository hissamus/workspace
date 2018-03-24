
public class PassByValueTest {

	public PassByValueTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void T1()
	{
		TestTOE tt=new TestTOE();
		tt.a1=100;
		tt.s1="TOE1";
		System.out.println(tt.toString());
		manuplate(tt);
		System.out.println(tt.toString());
	}
	
	public void manuplate(TestTOE m)
	{
		m.a1=10000000;
		m.s1="manuplate";
		System.out.println("Manuplated"+m.toString());
	}

	public static void main(String [] args)
	{
	  int passing = 3;
	  String a="tammed";	  
	  Receiving (passing);
	  Receiving (a);
	 
	  System.out.println("The value of passing is: " + passing);
	  System.out.println("The value of passing is: " + a);
	  PassByValueTest pvt=new PassByValueTest();
	  pvt.T1();
	  
	}
	
	public static void Receiving (int var)
	{
	  var = var + 2;
	}
	public static void Receiving (String var)
	{
	  var = var + 2;
	}
	
	private class TestTOE{
		
		public int a1=1;
		public String s1="toe";
		
		@Override
		public String toString()
		{
			return "|"+s1+":"+a1+"|";
		}
		
	}


}
