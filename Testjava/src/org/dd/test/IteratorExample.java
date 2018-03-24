package org.dd.test;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorExample {
 
    public static void main(String args[]){
        
    	IteratorExample ie=new IteratorExample();
    	ie.threadSafeFunction();
    	ie.errorFunction(); 
    }
    
    protected void errorFunction() throws ConcurrentModificationException{
    	List<String> myList = new ArrayList<String>();
    	 
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
 
        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println("List Value:"+value);
            if(value.equals("3"))
            	myList.remove(value);//causes the ConcurrentModificationException 
        }
 
        Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("1", "18");
        myMap.put("2", "28");
        myMap.put("3", "38");
 
        Iterator<String> it1 = myMap.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("2")){
                myMap.put("1","48");
                myMap.put("4", "4");////causes the ConcurrentModificationException
            }
        }
    }
    protected void threadSafeFunction() throws ConcurrentModificationException{
    	List<String> myList=new CopyOnWriteArrayList<String>();
    	myList.add("1");myList.add("2");myList.add("3");myList.add("4");myList.add("5");
    	
    	Iterator<String> it=myList.iterator();
    	while(it.hasNext()){
    		String value=it.next();
    		System.out.println("List Value:"+value);
    		if(value.equals("3")){
    			myList.remove(3);
    			myList.add("6");myList.add("7");myList.add("3");
    		}
    	}
    	
    	Map<String, String> myMap=new ConcurrentHashMap<String, String>();
    	myMap.put("1", "11");myMap.put("2", "21");myMap.put("3", "31");myMap.put("4", "41");myMap.put("5", "51");
    	Iterator<String >it1=myMap.keySet().iterator();
    	
    	while(it1.hasNext()){
    		String key=it1.next();
    		System.out.println("MayMap Value"+key+":"+myMap.get(key));
    		if(key.equals("2")){
    				myMap.put("1","111");
    				myMap.remove("3");
    				myMap.put("6", "61");myMap.put("7", "71");myMap.put("8", "81");
    		}
    		
    		
    	}
    	
    }
}
