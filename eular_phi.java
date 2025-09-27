
import java.util.Scanner;
public class eular_phi {
	static int gcd(int a, int b) {
		if(a==0) 
			return b;
		return gcd(b%a,a);
		
	} 
	static int phi(int n) {
		int result=1;
		for (int i=2;i<n;i++)
			if (gcd(i,n)==1)
				result++;
		return result;
	}
	public static void main(String args[]) {
		int n;
		System.out.println("enter the value for eular phi:");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		System.out.println("the eular phi value is :"+ phi(c));
		
		
}

}
