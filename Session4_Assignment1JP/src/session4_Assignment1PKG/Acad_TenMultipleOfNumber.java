package session4_Assignment1PKG;

import java.util.Scanner;

public class Acad_TenMultipleOfNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for which multiple of 10 has to be obtained : " );
		int a = scan.nextInt();
		System.out.println("Input : "+ a);
		System.out.println("Output ");
		for (int i = 1;i < 11 ;i ++){

		System.out.println( a + " * " + i+ " = " + a*i);
		        }


	}

}
