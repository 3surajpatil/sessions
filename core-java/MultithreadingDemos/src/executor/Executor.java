package executor;

import mythreads.MyThread;

public class Executor {

	public static void main(String[] args) {
	
		
		
		MyThread mythread = new MyThread();
		
		//this is not creatin java thread. this is just calling run method in MyThread class.
		//mythread.run();
		
		
		Thread t = new Thread(mythread);
		t.setPriority(10); // to set thread priority.
		t.start();   // call start method to start a thread. and do not call run method directly.

		
	}

}
