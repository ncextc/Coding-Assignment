import java.util.Scanner;
class Question9{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		System.out.println(numberOfWords(s));
		
		
		
	}
	
	public static int numberOfWords(String s){
		
		String[] str = s.split(" ");
		int count = 0;
		
		for(int i=0;i<str.length;i++){
			
			count++;
		}
		return count;
		
	}
}