/**
 * 
 */

/**
 * @author Hissam
 *
 */
public class Basics2 {

	/**
	 * 
	 */
	public Basics2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo f = new FooChild();
		f.foo(); 
	}

}

class Foo
{
    protected int x = 10;
   // public void foo(){System.out.println(x);}
    public static void foo(){System.out.println("in parent");}

}
class FooChild extends Foo
{
    protected int x = 20;
    //public void foo(){System.out.println(x);}
    public static void foo(){System.out.println("in child");}
}


