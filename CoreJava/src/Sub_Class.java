
public class Sub_Class extends Super_Class{

	Sub_Class(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	int num = 10;
	
	public void display(){
		System.out.println("Sub_Class displayed");
	}
	
	public void myMethod(){
		display();
		super.display();
		
		System.out.println("Sub value "+num);
		System.out.println("Super value "+super.num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub_Class subclass = new Sub_Class(21);
		subclass.myMethod();
		subclass.age();
		
	}

}
