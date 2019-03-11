class Machine{
	
	int i = 100;
	
	Machine(){
		System.out.println("Machine Constructor");
	}
	
	public void start(){
		System.out.println("Machine is started");
	}
}

class Camera extends Machine{
	
	Camera(){
		super();
	}
	
	public void start(){
		System.out.println("Camera is started");
		System.out.println(super.i);
		super.start();
	}
	
	public void snap(){
		System.out.println("Pic taken");
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Parent Class object creation
		Machine machine1 = new Machine();
		machine1.start();
		
		// Sub Class object creation
		Camera camera1 = new Camera();
		camera1.start();
		camera1.snap();
		
		// Upcasting
		int i =1;
		double d = (double)i;
		System.out.println(d);
		
		
		System.out.println("****************************************************");
		
		Machine machine2 = camera1;
		Machine machine3 = new Camera();
		machine2.start();
		machine3.start();
		
		
		// Downcasting
		
		long l =10;
        int i1=(int)l;
        System.out.println("\n"+i1);
        
//		Camera camera2 = (Camera) machine3;
//		camera2.start();
//		camera2.snap();
		
//		Camera camera3 = (Camera) new Machine();
//		camera3.start();
//		camera3.snap();
        
        FinalClass fc = new FinalClass();
        fc.Test();
        FinalClass.Test();
	}

}
