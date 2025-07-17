package string_1;

public class makeAbba {

	public static void main(String[] args) {
		System.out.println(addName("Hi","Bye"));
	}
	public static String addName(String a , String b) {
		return a + b + b + a;
	}
}
