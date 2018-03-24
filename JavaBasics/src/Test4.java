
public class Test4 {
	int a = 10;  //1
	static int b = 20;  //2
	
	{
		System.out.println("inside non static block");  //3
	}
	
	static{
		System.out.println("Inside  static block");  //4
	}
	
	void f1(){
		System.out.println("Inside f1");  //5
	}
	static void f11(){
		System.out.println("Inside static f11"); //6
	}
	
	public Test4(){
		System.out.println("Inside constructor");   //7
	}
	
	
	
	
}
