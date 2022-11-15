package javacode;

class Student1 {
	 Student1(int age){
		System.out.println("age:"+age);
		
	}
	 Student1(String name){
		 this(25);
		 System.out.println("name is"+name);
	 }
	 Student1(double hight){
		 this("abhi");
		 System.out.println("height"+hight);
	 }
	 public static void main(String[] args) {
		new Student1(4.1);
	}
	 

}
