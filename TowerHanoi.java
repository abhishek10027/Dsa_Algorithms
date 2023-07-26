package myproject;
import java.util.Scanner;

public class TowerHanoi {
	static void towerhanoi(int n,char S,char A,char D) {
		if(n==1) {
			System.out.println("move disk from "+ S +" to "+ D);
		}
		else {
			towerhanoi(n-1,S,D,A);
			System.out.println("move disk from "+ S +" to "+ D);
			towerhanoi(n-1,A,S,D);
			
		 }
	}
		
	static int pow(int x,int y) {
		int res=1;
		for(int i=1;i<=y;i++) {
			res=res*x;
		}
		return res;
	}
	
	
	public static void main(String args[]) {
		System.out.println("Enter the number of disk:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		towerhanoi(n,'S','A','D');
		int move=pow(2,n);
		System.out.println("total number of moves:"+(move-1));
		
		
		
	}

}
