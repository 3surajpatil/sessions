package mythreads;

public class MyThread implements Runnable{
	
	
	
	public void run()
	{
			for(int i=1;i<10;i++)
			{
				
				if(i==5)
				{
					try {
						
						
						Thread.currentThread().sleep(5000);
						
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		
				}
				
				
				System.out.println("in MyThread i:="+i);
				
			}
	}
	
}
