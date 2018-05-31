package user_input;

import java.util.Scanner;

public class Take_Input {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter some number");
		int a=scan.nextInt();
		
		System.out.println("Enter some string");
		Scanner scan1=new Scanner(System.in); 
		String s=scan1.nextLine();
		System.out.println("The entered number is: " +a);
		System.out.println("The entered string is: " +s);		

	}

}
