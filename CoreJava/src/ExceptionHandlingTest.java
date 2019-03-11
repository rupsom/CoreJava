import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class ExceptionHandlingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintWriter pw = null;
		try {
			pw = new PrintWriter("C:\\Users\\rrouth\\Desktop\\abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("Hello");
	}

}
