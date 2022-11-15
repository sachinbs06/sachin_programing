package sdbms;
import java.util.Scanner;
public class Fact {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		while(true) {
			System.out.println("Enter number whose factorial need tobe found");
			int n=scan.nextInt(); int fact=1;
			for (int i=n; i>=1; i--) {
				fact= fact*i;
			}
			System.out.println("Factorial of "+n+ " is "+fact);
		}
		
	}
}
