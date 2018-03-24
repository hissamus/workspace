import java.util.ArrayList;
import java.util.Iterator;


public class TestFailFast {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> anim=new ArrayList<String>();
		anim.add("tiger");
		anim.add("Lion");
		anim.add("monkey");
		
		for (Iterator iterator = anim.iterator(); iterator.hasNext();) {
			String anim1 = (String) iterator.next();
			
			anim.remove(1);
			//anim.add("sdjkflj");
			System.out.println("jhxdfkl"+anim.toString());
			
		}
		
		TestFailFast test=new TestFailFast();
		
	}

}
