package multithreading_priyanka_mam;
class thread8 extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getClass());
	}
}

public class getid_class_thread {
	public static void main(String[] args) {
		thread8 t8=new thread8();
		t8.start();
		
		thread8 t9=new thread8();
		t9.start();
	}

}
