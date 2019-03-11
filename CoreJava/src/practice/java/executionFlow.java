package practice.java;

public class executionFlow {

	executionFlow(int x)
	{
		System.out.println("Parameterized Constructor");
	}
	
	executionFlow()
	{
		System.out.println("NON-Parameterized Constructor");
	}
	
	static
	{
		System.out.println("Static 1");
	}
	
	{
		System.out.println("Initialization 1");
	}
		
	{
		System.out.println("Initialization 2");
	}
	
	static
	{
		System.out.println("Static 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new executionFlow();
		new executionFlow(8);
	}

}
