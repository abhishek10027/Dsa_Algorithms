

public class MaximumSum {
	static int findMaxSum(int []arr, int n)
    {
        int res = Integer.MIN_VALUE;
         
        for (int i = 0; i < n; i++)
        {
            int prefix_sum = arr[i];
             
            for (int j = 0; j < i; j++)
                prefix_sum += arr[j];
         
            int suffix_sum = arr[i];
             
            for (int j = n - 1; j > i; j--)
                suffix_sum += arr[j];
         
            if (prefix_sum == suffix_sum)
                res = Math.max(res, prefix_sum);
        }
         
        return res;
    }
     
    // Driver Code
    public static void main (String[] args)
    {
        int arr[] = {7,-6,3,5,7,2,1,-6};
        int n = arr.length;
        System.out.println("The maximum sum is :- "+findMaxSum(arr, n));
    }

}

