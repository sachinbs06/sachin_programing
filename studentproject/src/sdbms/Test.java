package sdbms;

public class Test {
	public static void main(String[] args) {
String s= "Hello123# bye"; int x=0;int y=0; int z=0;
char [] c = s.toCharArray();
System.out.println("Length of Array : "+c.length);
for(int i= 0; i<c.length; i++) {
	if((c[i]>='a'&&c[i]<='z')|| (c[i]>='A'&&c[i]<='Z')){
		System.out.println(c[i]+ "-->Is Alphabet");
		x++;
	}
	else if(c[i]>='0'&&c[i]<='9') {
		System.out.println(c[i] +"-->is Numeric");
		y++;
	}
	else {
		System.out.println(c[i]+ "-->is Special Character");
		z++;
	}
}
System.out.println("No of Alphabets "+ x);
System.out.println("No of Numerics "+ y);
System.out.println("No of Special character "+ z);


	}
}
