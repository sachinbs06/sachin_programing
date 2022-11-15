package javacode;

class Father {
	Father(String name){
		System.out.println("name"+name);

	}
}

class Son extends Father{
	Son()
	{
		super("abhi");
		System.out.println("bye");
	}
	public static void main(String[] args) {
		new Son();

	}

}


