
public class OOPs extends Calculation{

	public void multiplication (int x, int y){
		z = x * y;
		System.out.println("Multiplication is "+z+" of "+x+" and "+y);
		
		super.substraction(6, 9);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OOPs oops = new OOPs();
		oops.addition(5,8);
		oops.substraction(6, 9); //- Not calling from here
		oops.multiplication(9,9);
		oops.display();
	}

}
