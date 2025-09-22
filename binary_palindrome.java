

public class binary_palindrome {
	public static boolean isBinaryPalindrome(int num) {
		 String binary = Integer.toBinaryString(num); // Convert to binary string
		 int i = 0, j = binary.length() - 1; // Initialize two pointers
		while (i < j) {
		 if (binary.charAt(i) != binary.charAt(j)) {
		 return false; // If the characters don't match, it's not a palindrome
		 }
		 i++; // Move the left pointer
		 j--; // Move the right pointer
		 }
		 
		 return true; // It's a binary palindrome
		}
	public static void main(String args[]) {
		System.out.println("enter your number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isBinaryPalindrome(num));
	}

}

