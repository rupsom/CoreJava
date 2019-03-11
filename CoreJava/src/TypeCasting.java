
public class TypeCasting {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		byte b;  
        int i = 257;  
        double d = 323.142; 
        
        // String conversion
        String s = String.valueOf(i);
        System.out.println(s);
        
        System.out.println("Conversion of int to byte.");  
        
        b=(byte) i;
        
        System.out.print(b+" "+i);
        
        b=(byte) d;
        
        System.out.print("\n"+b+" "+d);
        
        long l =10;
        int i1=(int) l;
        System.out.println("\n"+i1);
        
        String s1=Integer.toString(i);
        System.out.println(s1);
        
        // String to Integer only if number is there in String
        String y = "18";
        int x = Integer.parseInt(y);
        System.out.println(x);// Runtime exception
		
//		for(String s : args){
//			System.out.println(s);
//		}
	}

}
