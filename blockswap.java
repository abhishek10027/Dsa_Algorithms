
public class blockswap {
	public static void swap(int arr[],int a,int b,int r) {
		for (int i=0;i<r;i++) {
			int temp=arr[a+i];
			arr[a+i]=arr[b+i];
			arr[b+i]=temp;
		}
	}
	public static void leftrotate(int arr[],int r) {
		int n=arr.length;
		if(r==0||r==n) return;
		int i=r;
		int j=n-r;
		while(i!=j) {
			if(i<j) {
				swap(arr,r-i,r+j-i,i);
				j=j-i;
			}
			else {
				swap(arr,r-i,r,j);
				i=i-j;
			}
		}
		swap(arr,r-i,r,i);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the element of the the array:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("enter the no of rotations:");
		int no_rotation=sc.nextInt();
		leftrotate(arr,no_rotation);
		System.out.println("Array elements after rotation:");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		
	}

}

