package recurssion;

public class OO9_PalindromeString {

	public static void main(String[] args) {
		
		String s="kaoauytutyuk";
		if(palindrome(s,0)) {
			System.out.println("palin");
		}else {
			System.out.println("not palin");
		}
		
		

	}

	private static boolean palindrome(String string,int i) {
		
		
		if(i==string.length()/2) {
			
			return true;
		}
		
		
		if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
			return false;
			
		}
		
		return palindrome(string, i+1);
		//return false;
		
		
	}

	

}
