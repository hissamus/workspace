import java.util.HashMap;
import java.util.Map;




public class InfiniteClass {

	private int id=-1;
	public InfiniteClass(int id) {
		this.id=id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0;
		Map<Integer, InfiniteClass> m =new HashMap<>(10);
		while(true)
		{
			InfiniteClass g=new InfiniteClass(++p);
			m.put(new Integer(g.hashCode()), g);
			System.out.println(p+"locations"+g.hashCode());
		}

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
