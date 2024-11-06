package multithreading_priyanka_mam;
import java.lang.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class thows_keyword {

}

class ex02{
	public static void main(String[] args) {
		ex01 e11=new ex01();
		try {
		e11.read();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class ex03{
	public static void main(String[] args) {
		ex01 e11=new ex01();
		try {
		e11.read();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class ex01{
	public void read() throws FileNotFoundException, ArrayIndexOutOfBoundsException, ArithmeticException
	//using of thows keyword
	{
	FileInputStream f1=new FileInputStream("C:\\Users\\soura\\OneDrive\\Documents\\demo.txt");
	
}}
