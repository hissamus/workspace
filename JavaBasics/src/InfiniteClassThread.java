import java.util.HashMap;
	import java.util.Map;
public class InfiniteClassThread implements Runnable{
		private int id=-1;
		public InfiniteClassThread(int id) {
			this.id=id;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int p=0;
			Map<Integer, InfiniteClass> m =new HashMap<>(10);
			while(true)
			{
				InfiniteClass g=new InfiniteClass(++p);
				m.put(new Integer(g.hashCode()), g);
				System.out.println("Map Size="+m.size()+"| Count="+ p+"| locations:"+g.hashCode());
			}

		}
		
		@Override
		protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Finalizing "+ id);
		}
		private class Parent
		{
			
			protected void show()
			{
				System.out.println("In Parent");
			}
			
		}
		
		private class Child extends Parent
		{
			protected void show()
			{
				System.out.println("In Child");
			}
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}

	}
