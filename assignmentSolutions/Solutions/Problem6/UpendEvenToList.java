import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpendEvenToList 
{
	public static void main(String args[])
	{
		List<Integer> MyList = new ArrayList<Integer>();
		List<Integer> MyListEven = new ArrayList<Integer>();
		
		MyList.add(1);
		MyList.add(2);
		MyList.add(3);
		MyList.add(4);
		MyList.add(5);
		MyList.add(6);
		MyList.add(7);
		MyList.add(8);
		MyList.add(9);
		
		int ele=0;
		System.out.println("Original List :" + MyList);
		Iterator<Integer> iterator = MyList.iterator();
		while(iterator.hasNext())
		{
			ele=iterator.next();
			if(ele % 2 == 0)
			{
				MyListEven.add(ele);
			}
		}
		Iterator<Integer> iteratorEven = MyListEven.iterator();
		while(iteratorEven.hasNext())
		{
			ele=iteratorEven.next();
			MyList.add(ele*2);
		}
		System.out.println("After upending even list is :" + MyList);
	}
	
}
