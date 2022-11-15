package sdbms1;

import java.util.Scanner;

public class registration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to SDBMS");
		System.out.println("----------------");
		
		StudentManagementSystem1 obj = new StudentManagementSystemImpl1();
		
		while(true){
			System.out.println("1:ADD STUDENT\n2:REMOVE STUDENT");
			System.out.println("3:REMOVE ALL STUDENTS\n4:DISPLAY STUDENTS");
			System.out.println("5:DISPLAY ALL STUDENTS\n6:UPDATESTUDENT");
			System.out.println("7:COUNT STUDENTS\n8:SORT STUDENTS");
			System.out.println("Enter Choice:");
			int choice= scan.nextInt();
			
			switch(choice) {
			case 1:
				obj.addStudent();
				break;
			case 2:
				obj.removeStudent();
				break;
			case 3:
				obj.removeAllStudent();
				break;
			case 4:
				obj.displayStudent();
				break;
			case 5:
				obj.displayAllStudent();
				break;
			case 6:
				obj.updatestudent();
				break;
			case 7:
				obj.countStudents();
				break;
			case 8:
				obj.sortStudents();
				break;
			case 9:
				System.out.println("thank you!!");
				System.exit(0);
				default:
					System.out.println("Invalid choice, kindly enter valid choice.");
			}
			System.out.println("-----------");
		}

	}

}
