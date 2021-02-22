package strings;

public class WordCount {
	public static void main(String[] args) {
		String str = "new String of word Count string of sTrIng";
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
		String[] strB2 = str.split(" ");
		int countB = 0;
		for (int i = 0; i < strB2.length; i++) {
			for (int j = 0; j < strB2.length; j++) {
				if (strB2[i].equalsIgnoreCase(strB2[j])) { // logic
					System.out.println(strB2[i]);
					countB++;
				}
			}
		}
		System.out.println(countB);
	}

}
