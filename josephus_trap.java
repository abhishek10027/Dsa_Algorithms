

import java.util.ArrayList;

public class josephus_trap {
	
	static void trap(ArrayList<Integer>L,int k,int pos) {
		if(L.size()==1) {
			System.out.print(L.get(0));
			return;
		}
		pos=(pos+k)%L.size();
		L.remove(pos);
		trap(L,k,pos);
		
	}
	public static void main(String args[]) {
		int pos=0;
		int k=1;
		System.out.print("The alive solder is : ");
		ArrayList<Integer>L=new ArrayList<Integer>();
		for(int i=1;i<=100;i++) {
			L.add(i);
		}
		trap(L,k,pos);
	}

}

