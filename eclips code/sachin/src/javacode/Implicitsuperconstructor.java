package javacode;

class Implicitsuperconstructor {
	Implicitsuperconstructor(){
		System.out.println(1);
	}
}
	class son1 extends Implicitsuperconstructor{
		son1(){
		System.out.println(2);
	}

	
	public static void main(String[]args) {
		new son1();
	}
	}
