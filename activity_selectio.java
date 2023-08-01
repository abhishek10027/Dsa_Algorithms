package myproject;

public class activity_selectio {
	public static void print(int s [],int f[],int n ) {
		int i,j;
		i=0;
		System.out.print(i+" ");
		for(j=1;j<n;j++) {
			if(s[j]>=f[i]) {
				System.out.print(j+" ");
				i=j;
			}
			
		}
		
		
	}
	public static void main(String args[]) {
		 
		int s[]= {2,5,3,7,4,8,6};
		int f[]= {4,6,2,1,5,3,7};
		int n=s.length;
		
		System.out.println("Selected Activities Are As Follow :-  ");
		print(s,f,n);
	}

}
