package practice.java;

public class DiscoPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		intPrint();
		System.out.println("#############################################");
		StarStartPrint();
		System.out.println("#############################################");
		StarEndPrint();
	}

	public static void intPrint(){
		for(int i=1; i<=5; i++){
			for(int s=1; s<=i; s++){
				System.out.print(s);
			}
			System.out.println();
		}
	}
	
	public static void StarStartPrint(){
		for(int i=1; i<=5; i++){
			for(int s=1; s<=i; s++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void StarEndPrint(){
		for(int i=1; i<=5; i++){
			for(int s=1; s<=(6-i); s++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
