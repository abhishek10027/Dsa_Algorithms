package myproject;

import java.util.Stack;
import java.util.Arrays;

public class StackSpanProblem {
	static void stackspan(int price[]) {
		Stack<Integer>st=new Stack<>();
		int n=price.length;
		st.push(0);
		int span[]=new int[n];
		for(int i=0;i<n;i++) {
			while(!st.empty()&&price[st.firstElement()]<=price[i])
				st.pop();
			if(st.empty())
				span[i]=i+1;
			else
				span[i]=i-st.firstElement();
			st.push(i);
			
		}
		System.out.println(Arrays.toString(span));
	}

	public static void main(String[] args) {
		int price[]= {10,4,5,90,120,80};
		stackspan(price);
		
		}
 }
