class Question8{
	public static void main(String[] args){
		
		String str = "AACADAEAFA";
		
		mostRepeated(str);
		
		
	}
	
	public static void mostRepeated(String s){
		
		int[] count = new int[256];
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			count[ch] += 1;
		}
		
		int maxCount = -1;
		char maxChar = 0;
		
		for(char ch : s.toCharArray()){
		
			if(count[ch] > maxCount){
				
				maxCount = count[ch];
				maxChar = ch;
				}
		}
		
		System.out.println(maxChar + " = " +maxCount + " occurence ");
	}
		
	
	
}