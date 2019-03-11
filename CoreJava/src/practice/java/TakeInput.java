package practice.java;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println("The multiplication of "+num1+" and "+num2+" is "+num1*num2 );
	}

}
