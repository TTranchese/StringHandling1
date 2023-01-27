public class Main {
	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "How are you?";
		char[] charArray = new char[]{string1.charAt(0),string1.charAt(1), string2.charAt(string2.length()-2), string2.charAt(string2.length()-1)};
		System.out.println(charArray);


	}
}