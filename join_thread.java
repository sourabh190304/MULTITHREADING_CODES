package multithreading_priyanka_mam;
class thread6 extends Thread{
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class join_thread {
	public static void main(String[] args) {
		thread6 t7=new thread6();
		t7.start();
		try {
			t7.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread6 t8=new thread6();
		t8.start();
		
	}

}
