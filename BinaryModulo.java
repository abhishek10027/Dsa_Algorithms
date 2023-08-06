package JavaProgram.GFG;

import java.util.Scanner;

public class BinaryModulo {
	
	static int modulo(String s, int m) {
		   int r=0;
		   int k=1;
		   for(int i=s.length()-1;i>=0;i--){
		       if(s.charAt(i)=='1'){
		           r=r+k;
		           r=r%m;
		       }
		       k=k*2;
		       k=k%m;
		   }
		   return r;
			
		}

	public static void main(String[] args) {
		System.out.println("Enter your String:");
		Scanner str=new Scanner(System.in);
		String s=str.nextLine();
		System.out.println("Enter your number for modulo:");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println(modulo(s,m));

	}

}
