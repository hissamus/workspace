import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenFromList 
{
	 static Integer a[];
	
	public static void main(String args[]) 
	{
		List<Integer> MyList = new ArrayList<Integer>();
		
		MyList.add(1);
		MyList.add(2);
		MyList.add(3);
		MyList.add(4);
		MyList.add(5);
		MyList.add(6);
		MyList.add(7);
		MyList.add(8);
		MyList.add(9);
		
		System.out.println("Before even number removal : "+ MyList);
		int ele=0;
		Iterator<Integer> iterator = MyList.iterator();
		while(iterator.hasNext())
		{
			ele=iterator.next();
			if((ele% 2)==0)
			{
				iterator.remove();
			}
		}
		System.out.println("After Even number removal : "+MyList);
	}
}