package string_1;

public class firstTwo {

	public static void main(String[] args) {
		
		System.out.println(FirstTwo("Hello"));
	}
	
	public static String FirstTwo(String str) {
		
		  if(str.length()>2){
		    return str.substring(0,2);
		  }
		  else{
		    return str;
		  }
		  
		}
}
