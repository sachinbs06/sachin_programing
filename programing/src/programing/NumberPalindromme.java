package programing;

public class NumberPalindromme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20202;
		int n1 = n;
		int res= 0,rem=0;
		while(n1!=0) {
			rem = n1%10;
			res=(res*10)+rem;
			n1=n1/10;
		}
		if(n==res) {
			System.out.println("Palindrome");
		}else {
			System.out.println("its not a palindromes");
		}

	}

}
