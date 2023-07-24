package myproject;


import java.util.*;
public class Leftshift {

	public static void main(String[] args) {
		System.out.println("enter your number:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("enter your number for  left shift operation:");
		int v=sc.nextInt();
		int b= x<<v;
		System.out.println("the left shift of "+ x +" is: "+ b);

	}

}
