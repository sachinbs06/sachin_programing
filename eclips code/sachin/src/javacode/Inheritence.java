package javacode;
//Single level inheritence

public class Inheritence {
	String universityname="VTU";
	void Conductexams() {
		System.out.println("conduct exams");
	}
}
class Collegename extends Inheritence{
	String collegename="ewit";
	void Conductinternals(){
		System.out.println("conduct internals");


	}
}
class Department extends Collegename{
	String deptname="mechanical";
	void giveassignment() {
		System.out.println("give assignment");
	}
}

class solution{
	public static void main(String[] args) {
		Department i= new Department();
	System.out.println(i.universityname);
	System.out.println(i.collegename);
	System.out.println(i.deptname);
	i.Conductexams();
	i.Conductinternals();
	i.giveassignment();
		
	}
}