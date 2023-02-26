class Question1{
	public static void main(String[] args){
		
		String str = "madam";
		
		boolean pal = isPalindrome(str);
		
		if(pal)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
	}
	
	public static boolean isPalindrome(String s){
		
		int start = 0;
		int end = s.length()-1;
		
		while(start<end){
			
			if(s.charAt(start) != s.charAt(end))
				return false;
				
				start++;
				end--;
			
		}
		return true;
	}
}