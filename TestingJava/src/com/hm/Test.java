/**
 * 
 */
package com.hm;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author Hissam
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<UUID, MyObject> hm=new HashMap<>();
			try{
			for(int i=0;i<10000;i++)
			{
				for(int j=0;j<i;j++)
				{
					for(int k=0;k<j;k++)
					{
						MyObject s=null;
						s=new MyObject(i,j,k,s);						
						hm.put(s.get_id(), s);
						Thread.sleep(1);
						System.out.println(s.tosString()+"HM-size="+hm.size());
					}
				}
			}
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
	}

}
