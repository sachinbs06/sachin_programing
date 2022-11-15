package jspider;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153, c =0;int n1=n;int n2=n;
		while(n!=0) {
			c++;
			n=n/10;
		}
		int e=c,rem=0,sum=0;
		while(n1!=0) {
			rem = n1%10;
			int ans = n1%10;
			//int ans=(int)Math.pow(rem,e);
			int pow=1;
			for(int i=1;i<=e;i++) {
				pow=pow*rem;
			}
			sum=sum+pow;
			n1=n1/10;
		}
if (n2==sum) {
	System.out.println("Armstrong");
}
else {
	System.out.println("Not Armstrong");
}
	}

}
