
public class ObjectCloning {

	static int rollNo;
	static String name;
	
	public ObjectCloning(int rollNo, String name){
		
		this.rollNo=rollNo;
		this.name=name;
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		ObjectCloning o1 = new ObjectCloning(100,"Biplab");
		ObjectCloning o2;
		
		try {
			
			o2 = (ObjectCloning)o1.clone();
			
			System.out.println("Roll Number "+o1.rollNo+" "+o1.name);
			System.out.println("Roll Number "+o2.rollNo+" "+o2.name);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
