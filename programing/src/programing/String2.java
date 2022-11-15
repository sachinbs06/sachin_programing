package programing;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelloHI123#Bye";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='a'&&c<='z') {
				c-=32;
				s1=s1+c;
			}
			else if(c>='A'&&c<='Z') {
				c+=32;
				s1=s1+c;
			}
			else {
				s1=s1+c;
			}
		}

	}

}
