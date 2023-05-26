package assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPalindrome("dad"));;
	}
	public static boolean isPalindrome(String s) {
	
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse)) {
			return true;
		}else {
			return false;
		}
		
	}

}
