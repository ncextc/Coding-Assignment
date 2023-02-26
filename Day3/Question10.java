class Question10{
	public static void main(String[] args){
		
		String str = "ABC";
		Combination(str, 0," ");
		
		
	}
	
	public static void Combination(String s , int i , String current){
		
		if(i == s.length()){
			System.out.println(current);
			return;
		}
		
		Combination(s,i+1,current+s.charAt(i));
		Combination(s,i+1,current);
		
	}
}