//Split numeric, alphabetic and special symbols from a String
package Logic1Core;

public class NumAndChar {

	public static void main(String[] args) {
		String str = "geeks01$$for02geeks03!@!!";

		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(),
				special = new StringBuffer();

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

		System.out.println("------------------------");
		for (int i = 0; i <= 256; i++) {
			System.out.print(i + ":" + (char) i + " ");
		}
		System.out.println("\n...................");

		StringBuffer aa = new StringBuffer();
		StringBuffer aa1 = new StringBuffer();
		StringBuffer aa2 = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch > 'a' || ch > 'z') {// (char)97
				aa = aa.append(ch);
			} else if ((char) 48 <= ch || ch >= (char) 57) {
				aa1 = aa1.append(ch);
			} else {
				aa2 = aa2.append(ch);
			}
		}

		System.out.println("after ::" + aa);
		System.out.println("after ::" + aa1);
		System.out.println("after ::" + aa2);
	}
}
