

public class first_palindrome {
	public static boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if (str.charAt(left)!=str.charAt(right))
				return false;
			left++;
			right--;
				}
		return true;
	}
	public static String firstPalindrome(String[] words) {
		for(int i=0;i<=words.length;i++) {
			if(isPalindrome(words[i]))
				return words[i];
		}
		return "";
	}
	public static void main(String args[]) {
		String str= "aba";
		String [] words={"a"};
		System.out.println("is this string palindromic :- "+isPalindrome(str));
		System.out.println("\nThe first palindrome is :- "+firstPalindrome(words));
	}
}

