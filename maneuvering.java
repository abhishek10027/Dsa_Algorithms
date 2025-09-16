

public class maneuvering {
	static int row =4;
	static int col=4;
	static int path(int r,int c) {
		if(r==row-1||c==col-1)
			return 1;
		return path(r,c+1)+path(r+1,c);
	}
	public static void main(String args[]) {
		System.out.println("the possible way:"+path(0,0));
	}

}

