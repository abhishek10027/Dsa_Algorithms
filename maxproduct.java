package myproject;

import java.io.*;
import java.util.Scanner;

public class maxproduct {
    
    static int maxProduct(int arr[])
    {
        
        int result = arr[0];
        int n = arr.length;
 
        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            // traversing in current subarray
            for (int j = i + 1; j < n; j++) {
                // updating result every time to keep an eye
                // over the maximum product
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            // updating the result for (n-1)th index.
            result = Math.max(result, mul);
        }
        return result;
    }
 
    // main class
    public static void main(String[] args)
    {
        
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the element of the the array:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
        System.out.println("Maximum Sub array product is :" + maxProduct(arr));
    }
}