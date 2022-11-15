package loosecoupling;

class PhonePay {
	void payment( ) {
		System.out.println("Paying through AmazonPay");
	}
}

class Paytm{
	void payment() {
		System.out.println("Paying through Paytm");
	}
	
}

class AmazonPay{
	void payment() {
		System.out.println("Paying through AmazonPay");
	}
}

class Person1{
	String name = "Jack";
	//AmazonPay amazonPay = new AmazonPay();
	 PhonePay phonePay = new PhonePay();
	// Paytm = new Paytm();
	
}
class Gateway{
public static void main(String[] args) {
	Person1 person = new Person1();
	System.out.println(person.name);
	//person.amazonPay.payment();
	person.phonePay.payment();
}

}
