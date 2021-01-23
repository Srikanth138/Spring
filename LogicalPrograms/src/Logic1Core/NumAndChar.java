//Split numeric, alphabetic and special symbols from a String
package Logic1Core;

public class NumAndChar {

	public static void main(String[] args) {
		String str = "geeks01$$for02geeks03!@!!";

		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			
			else if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			
			else
				special.append(str.charAt(i));
		}

		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
	}
}
