package multithreading_priyanka_mam;

class thread2 extends Thread{
	public void run() 
	{
		for(int i=0; i<3; i++) 
		{
			//System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().activeCount());
		}
	}
}
public class count_thread {
	public static void main(String[] args)
	{
		
		thread2 t1=new thread2();
		t1.setName("first");
		t1.start();

		thread2 t2=new thread2();
		t2.setName("second");
		t2.start();


	}

}


