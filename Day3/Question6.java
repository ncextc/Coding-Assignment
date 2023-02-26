class Question6{
	
	public static void main(String[] args){
		
		String s1 = "ABCDEFG";
		String s2 = "EFGABCD";
		
		boolean rot = isRotation(s1,s2);
		if(rot){
			System.out.println("Rotation of each other");
		}else{
			System.out.println("Not Rotation of each other");
		}
		}
	
	public static boolean isRotation(String s1 , String s2){
		
		if(s1.length() != s2.length()){
			return false;
		}
		
		String str = s1 + s1;
		
		if(str.indexOf(s2)!=-1){
			return true;
		}
		
		return false;
	}
	
}