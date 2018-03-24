/**
 * 
 */
package com.hm;

import java.util.UUID;

/**
 * @author Hissam
 *
 */

public class MyObject {

	private int _i,_j,_k;
	private UUID _id;
	public MyObject o;
	public MyObject(int i,int j, int k,MyObject o)
	{
		this.set_id(UUID.randomUUID());
		set_i(i);
		set_j(j);
		set_k(k);
		this.o=o;
	}
	
	public int get_i() {
		return _i;
	}

	public void set_i(int _i) {
		this._i = _i;
	}

	public int get_j() {
		return _j;
	}

	public void set_j(int _j) {
		this._j = _j;
	}

	public int get_k() {
		return _k;
	}

	public void set_k(int _k) {
		this._k = _k;
	}

	public String tosString()
	{
		return "|"+_i+":"+_j+":"+_k+":"+_id+"|";
	}
	
	public UUID get_id() {
		return _id;
	}

	public void set_id(UUID _id) {
		this._id = _id;
	}
	protected void finalize () throws Throwable {
	System.out.println("cleaning" + this.get_id().toString());	
	
	}
}
