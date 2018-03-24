package org.hissam;

import java.util.Random;

public class StackOverflow implements Cloneable{
	
	private int intI=0;
	private float floatI=1l;
	private double doubleI=1D;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	StackOverflow(int i, float f, double d){
		this.intI=i;
		this.floatI=f;
		this.doubleI=d;
		
	}
	
	
	public static void main(String[] args) {
		//	new StackOverflow(100,100l,100.01D);
		
		MemoryLeakStack<StackOverflow> mls=new MemoryLeakStack<>();
		Random random=new Random();
		for(int i=0;i< 100;i++){
			mls.push(new StackOverflow(random.nextInt(),random.nextFloat(),random.nextDouble()) );
		}
		
		while(!mls.isEmpty()){
			StackOverflow f=mls.pop();
			f.describe();
		}
	}
	
	public void describe(){
		System.out.println(this.intI+"||"+this.floatI+"||"+this.doubleI);
	}
	
	public StackOverflow recursive(StackOverflow s){
		StackOverflow s1=null;
		try {
			s1 = (StackOverflow)s.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s.recursive(s1);
	}

}
