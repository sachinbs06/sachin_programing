package normalCalcalotor;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		int a;
		int b;
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		System.out.println("WELCOME TO PEOPLES CALCULATOR!!");
		System.out.println("-------------------------------");
		
		StudentOperationImps obj = new StudentOperationImps();
		
		while(true) {
			System.out.println("1:ADDITION\n2:SUBTRACTION");
			System.out.println("3:MULTIPLICATION\n4:DIVISION");
			System.out.println("5:MODULUS");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				obj.add(choice ,choice);
				System.out.println();
				break;
			case 2:
				obj.subtract(choice, choice);
				break;
			case 3:
				obj.multiply(choice, choice);
				break;
			case 4:
				obj.division(choice, choice);
				break;
			case 5:
				obj.modulus(choice, choice);
				break;
			case 6:
				System.out.println("thank you!!");
				System.exit(0);
				default:
					System.out.println("Invalid choice, kindly enter valid choice.");
			}
			System.out.println("---------------");
		}

	}

}
