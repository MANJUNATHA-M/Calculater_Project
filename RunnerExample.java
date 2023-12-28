package com.calculator.ThreeLayer;
import java.util.Scanner;

public class RunnerExample {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);


		while(true)      // For infinite loop
		{
			System.out.println("ENTER THE VALUES");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("HI");
				break;
			case 2:
				System.out.println("bye");
				break;
			case 3:
				System.out.println(" thank you....!");
				break;
			default :
				System.out.println("invalid number");
				System.exit(0);                           // program will terminate 
			} // switch end
			System.out.println();
			System.out.println("---------------------");
		} //while end

	} //main end

} //class end
