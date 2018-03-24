public class FinallyReturnTest {

	public FinallyReturnTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		// call the proveIt method and print the return value
		System.out.println(FinallyReturnTest.proveIt());
		System.out.println(FinallyReturnTest.getANumber());
		System.out.println(FinallyReturnTest.getBNumber());
		System.out.println(FinallyReturnTest.getExitNumber());
	}

	//finally is executed though return is called in try
	public static int proveIt() {
		try {
			return 1;
		} finally {
			System.out.println("finally block is run  before method returns.");
		}
	}
	
	//here the return is 43
	public static int getANumber() {
		try {
			return 7;
		} finally {
			return 43;
		}
	}
	
	//here no exception is thrown, return is 43
	public static int getBNumber(){
	    try{
	        throw new NoSuchFieldException();
	    } finally {
	        return 43;
	    }
	}
	
	//program exist
	public static int getExitNumber(){
	    try{	    	
	        return 5;
	    } finally {	    	
	       System.exit(0);
	       return 15;
	    }
	}

}
