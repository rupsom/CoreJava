
public class Overloading {

	public int sum(int a, int b){
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	public double sum(int a, double b){
		double c= (double) (a+b);
		System.out.println(c);
		return c;
	}
	
	public String sum(String a){
		System.out.println(a);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading ov= new Overloading();
		ov.sum(10,10.5);
	}

}
