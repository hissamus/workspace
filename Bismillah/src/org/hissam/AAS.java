package org.hissam;

public class AAS {

	void close() {
		System.out.println("Close.");
	}
	
	public static void main(String[] args) throws Exception {
		AAS referenceObj = new AAS();
		try (AutoCloseable ac = referenceObj::close) {
		}
	}

}

