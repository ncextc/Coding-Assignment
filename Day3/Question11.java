class Question11{
	public static void main(String[] args){
		
		String str = "ABC";
		
		Permute(str , 0 ,str.length()-1);
		
		
	}
	
	public static void Permute(String s , int start , int end){
		
		if(start == end){
			
			System.out.println(s+" ");
			return;
		}
		
		for(int i = start ; i<= end ; i++){
			
			s = swap(s,start, i);
			Permute(s , start+1,end);
			s = swap(s , start , i);
		
		}
	}
	
	public static String swap(String s , int start , int end){
		
		char[] str = s.toCharArray();
		char temp = str[start];
		str[start] = str[end];
		str[end] = temp;
		return new String(str);
	}
}