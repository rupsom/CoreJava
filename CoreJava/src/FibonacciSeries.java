
public class FibonacciSeries {

	static int n1=0, n2=1, n3=0;
	static int count=15;
	
	public static void fibboSeries(int count){
		
		while (count>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(" "+n3);
			count --;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print(n1+" "+n2);
		fibboSeries(10);
	}

}
