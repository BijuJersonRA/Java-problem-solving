package string_1;

public class makeOutWord {

	public static void main(String[] args) {
		
		System.out.println(MakeOutWord("<<>>","Yay"));
	}
	
	public static String MakeOutWord(String out, String word) {
		  return out.substring(0,2)+word+out.substring(2);
		}

}
