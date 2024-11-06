package multithreading_priyanka_mam;

public class thows_02 {
	public static void main(String[] args) {
		{

			try {
				int a []= {10,20};
				System.out.println("arr : "+a[10]);
				System.out.println("ex : "+10/0);
			}
			catch(Exception E3) {
				System.out.println(E3);
			}
		}
	}
}
