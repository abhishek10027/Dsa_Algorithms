package myproject;
import java.util.Scanner;
import java.util.Stack;
public class CelebrityProblem {
	// This program for 4 x 4 matrix ,if n X n then change the size of the matrix in below static int matrix function
	static int matrix[][]= {{0,0,0,0},
			{1,0,0,0},
			{1,1,0,0},
			{1,1,0,0} };
	static boolean know(int a,int b) {
		boolean res=(matrix[a][b]==1)?true:false;
		return res;
	}
	static int findcelebrity(int n) {
		Stack<Integer>st=new Stack<>();
		int c;
		for(int i=0;i<n;i++) {
			st.push(i);
		}
		while(st.size()>1) {
			int a=st.pop();
			int b=st.pop();
			if(know(a,b)) {
				st.push(b);
			}
			else
				st.push(a);
		}
		if(st.empty()) {
			return -1;
			
		}
		c=st.pop();
		for(int i=0;i<n;i++) {
			if(i!=c&&(know(c,i)||!know(i,c)))
				return -1;
		}
		return c;
		
	}
	public static void main(String args[]) {
		System.out.println("enter the number of people in a party:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=findcelebrity(n);
		if(result==-1) {
			System.out.println("not a celebrity");
			
		}
		else {
			System.out.println("celebrity :- "+result);
			
		}
	}

}
