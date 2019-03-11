import java.io.IOException;


public class TestQue {

	public void show(){
		//this=null;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.out.println("hello instanceof java");
//		System.out.write("www.instanceofjava.com \n".getBytes());
//		System.out.format("%s", "www.instanceofjava.com \n");
//		System.err.print("This is custom error message");
//		System.console().writer().println("Hai");
		
		GetTestSet myObject = new GetTestSet();
//		myObject.emailAddress = "1000000";
		myObject.setEmailAddress("a@aol.com");
		myObject.getEmailAddress();
	}
}
