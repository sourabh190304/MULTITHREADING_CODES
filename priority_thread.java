package multithreading_priyanka_mam;

class thread3 extends Thread{
	public void run() 
	{
		for(int i=0; i<3; i++) 
		{
			System.out.println(Thread.currentThread().getPriority());
		}
	}
}
public class priority_thread {
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());

		thread3 t1=new thread3();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();

		thread3 t2=new thread3();
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();


	}

}



