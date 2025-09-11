public class Euclid_GCD {
	static int e_gcd(int a,int b){
		if(b==0) {
			return a;
		}
		else
			return e_gcd(b,a%b);
		
	}
	public static void main(String args[]) {
		System.out.println("Enter the value of a:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		System.out.println("the gcd is :"+e_gcd(a,b));
		
	}

}


