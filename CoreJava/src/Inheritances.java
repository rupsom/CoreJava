class A{
	
	public static void display(){
		System.out.println("Display of class A");
	}
}
public class Inheritances extends A{

	public static void display(){
		
		System.out.println("Display of class Inheritances");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritances i = new Inheritances();
		i.display();
	}

}
