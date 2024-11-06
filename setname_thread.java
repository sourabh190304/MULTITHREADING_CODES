package multithreading_priyanka_mam;

class thread1 implements Runnable{
	public void run() 
	{
		for(int i=0; i<3; i++) 
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class setname_thread {
	public static void main(String[] args)
	{
		//System.out.println(Thread.currentThread().getName());
		
		thread t1=new thread();
		Thread T1=new Thread(t1);
		//we are using this for set name to cureent thread (0- to first)
		T1.setName("first");
		T1.start();

		thread t2=new thread();
		Thread T2=new Thread(t2);
		//we are using this for set name to cureent thread (0- to second)

		T2.setName("second");
		T2.start();


	}

}

