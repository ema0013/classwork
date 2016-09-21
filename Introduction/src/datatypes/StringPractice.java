package datatypes;

public class StringPractice {

	public static void main(String[] args) {
		//String text = new String ("Hello World");
		String text1 = "Hello World";//same as above
		String text2 = "Hello ";//same as above
		String text3 = "World";
		if (text1.equals (text2+text3)) //== cannot be used for strings. use .equals method
			System.out.println("These strings are equal.");
		System.out.println(text1);
		System.out.println(text2+text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if(word1.compareTo(word2) < 0)
			System.out.println("Word 1 is before Word 2, lexicongraphically.");
	}
	
}
