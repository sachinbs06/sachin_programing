package sdbms;
import java.util.Scanner;
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Enter char to check wheather it is alpha,num, specialcharacter");
			char c = scan.next().charAt(0);

			if(c>='0' && c<='9') {
				System.out.println("Character is Number");

			}
			else if((c>='a'&& c<='z')||(c>='A' && c<='Z')) {
				System.out.println("character is alphabet");
			}
			else {
				System.out.println("given character is special character");
			}
			
		}
	}
}
