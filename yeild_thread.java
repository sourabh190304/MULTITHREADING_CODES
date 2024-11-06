package multithreading_priyanka_mam;

class thread10 extends Thread
{
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
	}
}

public class yeild_thread {
	public static void main(String[] args) {
		//to gave priotity to previous thread to first //.yield();
		Thread.yield();
		
		System.out.println(Thread.currentThread().getName());
		
		//.stop will stop the methood 
		thread10 t10=new thread10();
		t10.stop();
		t10.start();
		
		thread10 t11=new thread10();
		t11.start();
	}
}
