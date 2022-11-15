package javacode;

public class Smallest {
	public static void main(String[] args) {
		int[]a= {10,20,30,5};
		int small=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<small){
				small=a[i];
				
			}

			System.out.println("smallest value is "+small);
		}

	}


}
