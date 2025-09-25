
public class SlidingWindow {
	static void slide(int arr[],int k) {
		int n=arr.length;
		int max=0;
		for(int i=0;i<=n-k;i++) {
			max=arr[i];
			for(int j=1;j<k;j++) {
				if(arr[i+j]>max) {
					max=arr[i+j];
				}
			}
			System.out.print(max+" ");
			
		}
			
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,4,5,2,3,6};
		slide(arr,3);
	}
   }

