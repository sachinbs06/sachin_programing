package javacode;

class Methodovetrridding{
	void work() {
		System.out.println("working");
	}

}
class Developer extends Methodovetrridding{
	void work() {
		super.work();
		System.out.println("develops an app");
	}
}
class Tester extends Methodovetrridding{
	void work() {
		super.work();
		System.out.println("tests an app");
	}
	
}
class Solution1{
	public static void main(String[] args) {
		Developer d=new Developer();
		d.work();
		Tester t=new Tester();
		t.work();
		
	}
}

