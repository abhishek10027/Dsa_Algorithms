package myproject;
import java.util.Scanner;
public class sievalgo {
	 public static void main(String args[]) { 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the value of n:");
	      int n=sc.nextInt();  
	      boolean[] arr = new boolean[n];  
	       
	      for (int i = 0; i<n; i++) {  
	         arr[i] = true;  
	      }  
	      for (int i = 2; i< Math.sqrt(n); i++) {  
	         if(arr[i] == true) {  
	            for(int j = (i*i); j<n; j = j+i) {  
	               arr[j] = false;  
	            }  
	         }  
	      }  
	       for (int i = 2; i<n; i++) {  
	         if(arr[i]==true) {  
	            System.out.println(i);  
	         }  
	      }  
	   }  

}
