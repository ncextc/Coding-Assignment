import java.util.*;
class Question7{
	public static void main(String[] args){
		
		String s1 = "CARE";
		String s2 = "RACE";
		Anagram(s1 , s2);
	}
	
	public static void Anagram(String s1 , String s2){
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() == s2.length()){
			
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean flag = Arrays.equals(ch1 ,ch2);
			
			if(flag){
				System.out.println("Strings are Anagram");
			}
			else{
				System.out.println("Strings are not Anagram");
			}
		}
		else{
			System.out.println("Strings are not Anagram");
		}
	}
}