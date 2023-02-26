import java.util.Scanner;
class Question5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();
		
		numberOfVowels(str);
		
		
		
	}
	
	public static void numberOfVowels(String s){
		
		boolean flag = true;
		
		char ch ;
		
		for(int i=0;i<s.length();i++){
			
			ch = s.charAt(i);
			switch(ch){
				
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				flag = false;
				System.out.print(ch + " ");
			}
		}
		
		if(flag){
			System.out.println("No vowels found");
		}
		
	}
	
	
}