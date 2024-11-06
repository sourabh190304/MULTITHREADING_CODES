package multithreading_priyanka_mam;
class thread5 extends Thread
{
	public void run() {
		for(int i=0; i<3; i++) 
		{
			System.out.println(Thread.currentThread().isDaemon());
		}
	}
}
public class daemon_thread {
	public static void main(String[] args) {
		thread5 t6=new thread5();
		t6.start();

		thread5 t5=new thread5();
		t5.setDaemon(true);
		t5.start();
	}
}
