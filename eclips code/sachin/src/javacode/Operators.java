package javacode;

public class Operators {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int d=10;
		System.out.println((a<=c)&&(a>=c)||(c>=a));
		System.out.println((a==b)&&(a>=c)||(a==d));
		a+=20;
		b+=10;
		c-=10;
		d*=2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		a+=10;
		c+=10;
		d/=1;
		d+=20;
		System.out.println((a<=c)||(b>a)||(c>=a));
		System.out.println((a==b)&&(a>=c)||(a==d));
		System.out.println((a!=20)||(c==30)&&(!((d>=c))));
		
		
		
	}
	
	

	

}
