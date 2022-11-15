package sdbms;

public class Factors {
	public static void main(String[] args) {
		int n = 100; int count=0;
		System.out.println("Factors of "+n);
		for(int i =1; i<=n;i++) {
			if(n%i == 0) {
				System.out.println("\n"+i);
				count++;
			}
		}
		System.out.println("No of factors "+count);
	}
}
