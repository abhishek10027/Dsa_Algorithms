

import java.util.Scanner;

public class Rightshift {
	public static void main (String args[]) {
	System.out.println("Enter your number:");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	System.out.println("Enter your number for right shift operation:");
	int v=sc.nextInt();
	int b= x>>v;
	System.out.println("The right shift of "+ x +" is: "+ b);
	}


}

