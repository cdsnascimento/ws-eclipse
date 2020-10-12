
public class functionStrings {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		
		String s06 = original.replace('a', 'X');
		String s07 = original.replace("abc", "Xy");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: " + original);
		System.out.println("toLowerCase: " + s01);
		System.out.println("toUpperCase: " + s02);
		System.out.println("trim: " + s03);
		System.out.println("sbustring(2): " + s04);
		System.out.println("sbustring(2, 9): "  + s05);
		
		System.out.println("repalce: "  + s06);
		System.out.println("repalce: "  + s07);
		
		System.out.println("indexOf: "  + i);
		System.out.println("Last index 0f 'bc': "  + j);
		
	}
}
