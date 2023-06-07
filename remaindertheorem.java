package myproject;

import java.io.*;

public class remaindertheorem {
      
    
    static int findMinX(int num[], int rem[], int k)
    {
        int x = 1; 
        while (true)
        {
            
            int j;
            for (j=0; j<k; j++ )
                if (x%num[j] != rem[j])
                   break;
       
            
            if (j == k)
                return x;
       
            
            x++;
        }
       
    }
       
    // Driver method
    public static void main(String args[])
    {
        int num[] = {5, 7, 35};
        int rem[] = {3, 5, 33};
        int k = num.length;
        System.out.println("x is " + findMinX(num, rem, k));
    }
}
  
