package jspider;

public class FebinociSerice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=0;
		while(n1<=10) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}

	}

}
