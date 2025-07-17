package string_1;

public class makeTags {

	public static void main(String[] args) {
		
		System.out.println(MakeTags("i","Yay"));
	}
	
	public static String MakeTags(String tag, String word) {
		return "<"+tag+">"+word+"</"+tag+">";
	}
}
