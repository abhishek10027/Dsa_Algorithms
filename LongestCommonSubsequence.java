package DSA;

/*
 *  Problem Statement :- Given two strings, find the length of longest subsequence present in both of them. 
 *                       Both the strings are in uppercase latin alphabets.
 */
public class LongestCommonSubsequence {
	
	static int lcs(int x, int y, String s1, String s2)
    {
        int[][] dp = new int[x+1][y+1];
        for(int i = 1; i<= x; i++){
            for(int j = 1; j<=y; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[x][y];
    }

	public static void main(String[] args) {
		int A = 6, B = 6;
		String str1 = "ABCDGH";
		String str2 = "AEDFHR";
		
		int ans=lcs(A,B,str1,str2);
		System.out.println("Longest Common Subsequence between "+ str1+" and "+str2+" is :- "+ans);
		
	}

}
