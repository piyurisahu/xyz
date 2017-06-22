
public class DeadlockByMyself {
	
	public static String t1="piyuri";
	public static String t2="sahu";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		
		
	}
	
	
	class Thread1 extends Thread
	{
		
		public void run()
		{
		synchronized (t1) {
			System.out.println("t1 is locked");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (t2) {
				System.out.println("t2 is locked");
				
			}
		}	
		}
		}
	
	
	class Thread2 extends Thread
	{
		
		public void run()
		{
		synchronized (t2) {
			System.out.println("t1 is locked");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (t1) {
				System.out.println("t2 is locked");
				
			}
		}	
		}
		}

}


