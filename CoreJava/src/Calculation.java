
public class Calculation {

	int z;
	
	public void addition(int x, int y){
		z = x + y;
		System.out.println("Addition is "+z+" of "+x+" and "+y);
	}
	
	public void substraction(int x, int y){
		z = x - y;
		System.out.println("Substraction is "+z+" of "+x+" and "+y);
	}
	
	public static void display(){
		System.out.println("Test Calculation");
	}
}
