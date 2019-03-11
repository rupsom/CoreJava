class MethodParentHiding{

	static void test(String name){
		System.out.println(name);
	}
	
	static void test1(){
		System.out.println("Parent");
	}
}

class MethodChildHiding extends MethodParentHiding{
	
	static void test(String name){
		System.out.println(name);
	}
	
	static void test(int name){
		System.out.println(name);
	}
	
	static void test1(){
		System.out.println("Child");
	}
}

public class MethodHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodChildHiding.test(1);
//		MethodChildHiding.test1();
		MethodParentHiding mph = new MethodChildHiding();
		mph.test1();
	}

}
