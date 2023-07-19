package myproject;

public class move_hyphen {
	static void movehyphen(char str[]) {
		int i=str.length-1;
		for(int j=i;j>=0;j--) {
			if(str[j]!='-') {
				char c=str[i];
				str[i]=str[j];
				str[j]=c;
				i--;
			}
		}
		
	}
	public static void main(String args[]) {
		char [] str="h-e-l-lo-w-v-i-t-@".toCharArray();
		movehyphen(str);
		System.out.println(String.valueOf(str));
	}

}
