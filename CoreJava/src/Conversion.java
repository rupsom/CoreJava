import org.testng.Assert;


public class Conversion {

	static double totalP;
    static String total;
	static String originalFromUI = "200";
    
	public Conversion(double p1, double p2){
		//this.p2=p2; this.p2=p2;
		System.out.println(totalP = p1+p2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conversion con = new Conversion(100.89,99.11);
				
		//1. Double to String
		total=String.valueOf(totalP);

		System.out.println("-----------------------------------------------");
		//2. Check decimal
		if(total.endsWith(".0")|| total.endsWith(".00")){
		//3. replace the values from decimal
			total = total.replace(".0", "");
			Assert.assertEquals(total,originalFromUI,"Failed");
			System.out.println(total);
		}
		else{
			System.out.println(total);
			Assert.assertEquals(total,originalFromUI,"Failed");}
	}

}
