package loosecoupling;

interface Vechile {
	void travel();
}

class Bike implements Vechile{
	@Override
	public void travel() {
		System.out.println("Travelling through Bike");
	}

}

class Car implements Vechile{
	@Override
	public void travel() {
		System.out.println("Travelling through car");
	}
}

class Bus implements Vechile {
	@Override 
	public void travel() {
		System.out.println("Traveklling throug Bus");
	}
}

class Person {
	String name;
	Vechile vechile;

	Person(String name, Vechile vechile){
		this.name = name;
		this.vechile = vechile;

	}
}

class Solution{
	public static void main(String[] args) {
		Person p=new Person("Tom", new Bus());
		System.out.println("Name:"+p.name);
		p.vechile.travel();
	}
}