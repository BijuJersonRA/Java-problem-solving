package string_1;

public class extraEnd {

	public static void main(String[] args) {
		
		System.out.println(ExtraEnd("Hello"));
	}
	
	public static String ExtraEnd(String str) {
		  String str1 = str.substring(str.length()-2);
		  return str1 + str1 + str1;
		}
}
