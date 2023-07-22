package myproject;
import java.util.*;
public class flippingnumber_bit {
	static int flipbit(int n) {
		int max =0;
		int cur=0;
		int prev =0;
		while(n>0) {
			if ((n & 1)==1) {
				cur++;
			}
			else if((n & 1)==0) {
				prev=((n & 2)==0)?0:cur;
				cur=0;
			}
			max=Math.max(cur+prev,max);
			n=n>>1;
		}
		return(max+1);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number for flipping bit:");
		int a=sc.nextInt();
		System.out.println("Flipping bits :- "+flipbit(a));
	}

}
