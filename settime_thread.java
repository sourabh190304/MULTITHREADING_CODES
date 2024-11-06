package multithreading_priyanka_mam;
class thread4 extends Thread{
public void run() 
{
	for(int i=0; i<3; i++) 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
}
public class settime_thread {
	public static void main(String[] args) {
		{

			thread4 t1=new thread4();
			t1.start();

			thread4 t2=new thread4();
			t2.start();


		}
	}

}
