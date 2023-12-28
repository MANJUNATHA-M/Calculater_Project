package com.calculator.ThreeLayer;
import java.util.Scanner;

public class CalculatorSolution {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		// upcasting ---> Abstraction 
		Calculator calc=new CalculatorImpl();

		while(true)    //  for Infinate loop
		{
			// MENU DRIVEN PROGRAM
			System.out.println("1.Addition\n2.Subtraction");
			System.out.println("3.Multiplecation\n4.Division\n5.EXIT");
			System.out.println();
			System.out.println("ENTER THE CHOICE");

			int choice=scan.nextInt();  // 1 2 3 4  only for this otherwise invalid choice.
			
			// local variables does not have default values, so initializing to 0.
			int a=0;
			int b=0;

			//accepting a and b only if the choice is 1 2 3 4
			if(choice>=1 && choice<=4)
			{
				System.out.println("ENTER THE FIRST VALUES");
				a=scan.nextInt();
				System.out.println("ENTER THE SECOND VALUES");
				b=scan.nextInt();
			}

			switch(choice)
			{
			case 1:
				System.out.println("sum of "+a+" and "+b+" is "+calc.add(a, b));
				System.out.println("----------");
				break;
			case 2:
				System.out.println("sum of "+a+" and "+b+" is "+calc.sub(a, b));
				System.out.println("----------");
				break;
			case 3:
				System.out.println("sum of "+a+" and "+b+" is "+calc.mul(a, b));
				System.out.println("----------");
				break;
			case 4:
				System.out.println("sum of "+a+" and "+b+" is "+calc.div(a, b));
				System.out.println("----------");
				System.out.println();
				break;
			default :
				System.out.println(" INVALID CHOICE...!");
				System.exit(0);
			}

		}

	}

}
