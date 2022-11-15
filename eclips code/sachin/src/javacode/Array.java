package javacode;

public class Array {
	public static void main(String[] args) {
		int[] a= {10,20,30};
		for(int i=0;i<a.length;i++) {
			//a[i] print elements of an array
			System.out.println(a[i]);
			// i print index point of the array element
			System.out.println(i);
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		String [] b= {"abhi","pavan","bharath"};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		for(int i=b.length-1;i>=0;i--) {
			System.out.println(b[i]);
		}


	}



}


