package myproject;

public class warnsdorff {
	static final int n=6;
	public static boolean isvalid(int i,int j,int sol[][]) {
		if(i>=1&&i<=n&&j>=1&&j<=n) {
			if(sol[i][j]==-1)
				return true;
		}
		return false;
	}
	public static boolean knighttour(int sol[][],int i,int j,int stepcount,int xmove[],int ymove[]) {
		if(stepcount==n*n)
			return true;
		for(int k=0;k<n;k++) {
			int nextl=i+xmove[k];
			int nextj=j+xmove[k];
			if(isvalid(nextl,nextj,sol)) {
				sol[nextl][nextj]=stepcount;
				
				if(knighttour(sol,nextl,nextj,stepcount+1,xmove,ymove))
					return true;
				sol[nextl][nextj]=-1;
		}
		
		}
		return true;
	}
	public static boolean startknight() {
		int [][]sol=new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				sol[i][j]=1;
			}
		}
		int xmove[]= {2,1,-1,-2,-2,-1,1,2};
		int ymove[]= {1,2,2,1,-1,-2,-2,-1};
		sol[1][1]=0;
		if(knighttour(sol,1,1,1,xmove,ymove)) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(sol[i][j]+"\t");
				}
				System.out.println();
			}
			
		}
		return true;
		
	}
	public static void main(String args[]) {
		warnsdorff ans= new warnsdorff();
		ans.startknight();
		
		
	}
		
}


