
public class CallByValueAndCallByRef {

	int data = 50;
	
	void change(int data){
	
		data=data+100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValueAndCallByRef val = new CallByValueAndCallByRef();
		
		System.out.println("Before Change value is "+val.data);	
		val.change(100);
		System.out.println("After Change value is "+val.data);
	}
}
