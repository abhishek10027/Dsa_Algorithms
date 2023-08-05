package myproject;

public class majority_element {
	static int majority(int [] arr) {
		int n=arr.length;
		int count=0;
		int element=0;
		for(int i=0;i<n;i++) {
			if(count==0) {
				element=arr[i];
			}
			if(element==arr[i])
				count=count+1;
			else
				count=count-1;
		}
		return element;
		
	}
	public static void main(String args[]) {
		int arr[]= {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
		System.out.println("The mojority element is : "+majority(arr));
	}

}
