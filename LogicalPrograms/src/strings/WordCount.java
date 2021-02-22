package strings;

public class WordCount {
	public static void main(String[] args) {
		String str = "new String of word Count string of sTrIng";
		// str.reverse(); reverse is now work in String.

		StringBuffer sb = new StringBuffer(str); // StringBuffer is work in
													// revers
		System.out.println(sb.reverse());

		StringBuilder sb1 = new StringBuilder("hello.."); // StringBuilder is
															// work revers
		sb1.append(str);
		System.out.println(sb1.reverse());

		String str1 = "String";
		String[] str2 = str.split(" ");
		// String[] str2 = str.split(" ",7);
		int count = 0;
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
			if (str1.equalsIgnoreCase(str2[i])) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("-----------------------");
		String[] strA2 = str.split(" ");
		int countA = 0;
		for (int i = 0; i < strA2.length; i++) {
			if (strA2[1].equalsIgnoreCase(strA2[i])) { // logic
				countA++;
			}
		}
		System.out.println(countA);

		System.out.println("-----------------------");
		System.out.println("String Compare the String........ ");
		String[] strB2 = str.split(" ");
		int countB = 0;

		// "new String of word Count string of sTrIng";
		for (int i = 0; i < strB2.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println(i + " , " + j);
				if (strB2[i].equalsIgnoreCase(strB2[j])) { // logic
					System.out.println(strB2[j]);
					countB++;
				}
			}
		}
		System.out.println(countB);

		System.out.println("-----------------------");

		System.out.println("String Charactor's to print.........1 ");
		int countC = 0;
		// String[] strC2 = str.split(""); //here count the spaces also //
		String[] strC2 = str.split(" "); // here not count the spacess int

		for (int i = 0; i < strC2.length; i++) {
			for (int k = 0; k < strC2[i].length(); k++) {
				char ch = strC2[i].charAt(k);
				if (ch == 'o') {
					System.out.println(ch + " " + i + " " + k);
					countC++;
				}
			}
		}
		System.out.println(countC);

		System.out.println("-------------------------");
		System.out.println("String Charactor's to print.........2 ");
		int i = 0, count4 = 0;
		for (i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'o') {
				System.out.println(ch + " " + i);
				count4++;
			}
		}
		System.out.println(count4);
	}

}
