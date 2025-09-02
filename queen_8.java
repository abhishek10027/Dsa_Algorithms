

import java.util.Scanner;

public class queen_8 {
	
	
	void printa(int arr[][]) {
		int n=arr.length;
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==0) {
					System.out.print(" 0 ");
				}
				else
					System.out.print(" Q "); //1 means queen;
			}
			System.out.println();
		}
	}
	void board () {
		System.out.println("Please enter the rows in the matrix:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Please enter the columns in the matrix:");
		int column = sc.nextInt();
		
		int[][] arr = new int[row][column];
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				
			}
		}
		System.out.println( );
		System.out.println("The initial Matrix:\n");
		print2dArray(arr);
		if(arr.length<=3) {
			System.out.print("atleast try wirh 4 cross 4    matrix");
			
		}
		else if(solveboard(arr,0)==false) {
			System.out.println("Solution does not exits");
			
		}
		
		else 
			printa(arr);
			
	}
	private static void print2dArray(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				System.out.print(matrix[r][c] + "\t");
			}
			System.out.println();
		}
		System.out.println("the optimal solution is :\n ");
	}
	boolean solveboard(int arr[][],int col) {
		int n=arr.length;
		if(col>=n)
			return true;
		for (int i=0;i<n;i++) {
			
			if(safe(arr,i,col)==true) {
				arr[i][col]=1;
				if(solveboard(arr,col+1)==true)
					return true;
				arr[i][col]=0;
			}
		}
		return false;
	}
	boolean safe(int arr[][],int row,int col) {
		int n=arr.length;
		for(int i=0;i<col;i++) {
			if(arr[row][i]==1) {
				return false;
			}
		}
		for(int i=row,j=col;i>=0&&j>=0;i--,j--) {
			if(arr[i][j]==1) {
				return false;
			}
		}
		for(int i=row,j=col;j>0&&i<n;i++,j--) {
			if(arr[i][j]==1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		
		queen_8 q=new queen_8();
		q.board();
		
		
	}


}

