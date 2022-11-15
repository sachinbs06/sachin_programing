package javacode;

public class Whatsapp1 {
	void sendmessege() {
		System.out.println("single ticksupported");
	}

}
class Whatsup2 extends Whatsapp1{

	@Override
	void sendmessege() {
		super.sendmessege();
		System.out.println("double tick supported");
	}
	void Story() {
		System.out.println("images supported");
	}
}
class Whatsapp3 extends Whatsapp1{
	@Override
	void sendmessege() {
		super.sendmessege();
		System.out.println("blue ticksupported");
	}
	void Story() {
		System.out.println("videos supported");
	}
	void payment() {
		System.out.println("upi payment supported");
	}
}
class Solution3{
	public static void main(String[] args) {
		Whatsapp3 w= new Whatsapp3();
		w.sendmessege();
		w.Story();
		w.payment();


	}
}
