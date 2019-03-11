package practice.java;

import java.util.Scanner;

public class TakeInputII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		
		for(int i=1; i<=10; i++){
			System.out.println(num1+" * "+i+" = "+num1*i);
		}
	}

}
