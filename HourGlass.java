
/*
 * Problem Statement :- You are given an m x n integer matrix grid.
 * We define an hour glass as a part of the matrix that Return the maximum sum of the elements of an hour glass.
 */

public class HourGlass {

	public static int maxhourSum(int[][]matrix) {
		
		int maxsum=Integer.MIN_VALUE;
		int rlen=matrix.length,clen=matrix[0].length;
		// condition
		if(rlen<3||clen<3)
			return maxsum;
		
		for (int i=1;i<rlen-1;i++) {
			for(int j=1;j<clen-1;j++) {
				int sum=matrix[i-1][j-1]+matrix[i-1][j]+matrix[i-1][j+1]+matrix[i][j]+matrix[i+1][j-1]+matrix[i+1][j]+matrix[i+1][j+1];
				maxsum=Math.max(maxsum, sum);
			}
		}
		return maxsum;
	}
	public static void main(String args[]) {
		int [][]matrix= {{1, 1, 1, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0 },
				 { 1, 1, 1, 0, 0, 0 },
				 { 0, 0, 2, 1, 1, 0 },
				 { 0, 0, 0, 2, 0, 0 },
				 { 0, 0, 1, 2, 4, 0 }
};
		System.out.println("the maximum hour glass sum is :"+maxhourSum(matrix));
	}


}

