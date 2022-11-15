package normalCalcalotor;

import java.util.Scanner;

public class StudentOperationImps implements StudentOperation{
	Scanner s = new Scanner(System.in);
	public int a;
	public int b;

	@Override
	public int add(int a,int b) {
		System.out.println("");
		return a+b;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int subtract(int a,int b) {
		System.out.println("");
		return a-b;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int multiply(int a,int b) {
		System.out.println("");
		return a*b;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int division(int a,int b) {
		System.out.println("");
		return a/b;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int modulus(int a,int b) {
		System.out.println();
		return a%b;
		// TODO Auto-generated method stub
		
		
	}
	
}
