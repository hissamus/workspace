import javax.swing.JOptionPane;


public class TestShift {

	private int size=1000;
	public int size()
	{
		return size;
	}
	public TestShift() {
		// TODO Auto-generated constructor stub
	}
	
	protected void change()
	{
		this.size=99;
	}

	public static void main(String[] args) {
		int sortType=0;
		boolean show=true;
		while(sortType!=1001 && show){
		 sortType= Integer.parseInt(JOptionPane.showInputDialog("Enter capacity"));
		System.out.println(sortType >>20);
		//oldCapacity >> 1
		}
		
		TestShift ts=new TestShift();
		System.out.println(ts.size());
		ts.change();
		System.out.println(ts.size());
	}

}
