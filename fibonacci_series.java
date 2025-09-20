

import java.util.*;
public class fibonacci_series {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your n th term position:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		int c;
		for (int i=0;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			
		}
		
	}

}

