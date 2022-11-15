package jspider;

public class Biggestwordingivenstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello hi bye WELCOME";
		String arr[]=s.split(" ");
		
		for(String ele:arr) {
			String s1="";
			for(int i=ele.length()-1;i>=0;i--) {
				s1=s1+ele.charAt(i);
			}
			System.out.println(s1+" ");
		}
		
	}

}
