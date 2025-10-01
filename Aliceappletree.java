
public class Aliceappletree {
	static int appletree(int n,int s,int e,int w,int m,int k) {
		if(m<=s*k)
			return m;
		else if (m<=s*k+e+w)
			return (s*k+(m-s*k)*k);
		else 
			return -1;
		
	}
public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the vaule of m :- ");
	int m=sc.nextInt();
	System.out.println("enter the vaule of k :- ");
	int k=sc.nextInt();
	System.out.println("enter the vaule of n :- ");
	int n=sc.nextInt();
	System.out.println("enter the vaule of s :- " );
	int s=sc.nextInt();
	System.out.println("enter the vaule of w :- ");
	int w=sc.nextInt();
	System.out.println("enter the vaule of e :- ");
	int e=sc.nextInt();
	
	int out=appletree(m,k,n,s,w,e);
	System.out.println("the answer is : "+out);
	
	}
}



