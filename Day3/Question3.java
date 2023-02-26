class Question3{
	public static void main(String[] args){
		
		String str = "Hello";
		
		System.out.println(reverse(str));
		
		
	}
	
	public static String reverse(String s){
		
		if(s.length()==0)
			return s;
			
		return reverse(s.substring(1)) + s.charAt(0);	
	}
}