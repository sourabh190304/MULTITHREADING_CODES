package multithreading_priyanka_mam;

class thread implements Runnable{
	public void run() 
	{
		for(int i=0; i<3; i++) 
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class thread_example {
	public static void main(String[] args)
	{
		//System.out.println(Thread.currentThread().getName());
		
		thread t1=new thread();
		Thread T1=new Thread(t1);
		T1.start();

		thread t2=new thread();
		Thread T2=new Thread(t2);
		T2.start();


	}

}
