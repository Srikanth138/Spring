package strings;

public class LatterCount {

	public static void main(String[] args) {
		String name = "hello im your friend";
		int count = 0;
		System.out.println("Length of the String :: "+name.length());
		for (int i = 0; i < name.length(); i++) {
			if ('e' == name.charAt(i) || 'E' == name.charAt(i)) {
				count++;
			}
		}
		System.out.println("count of the this latter "+count);

		System.out.println("Each Later Count in the String");
		for (int i = 0; i < name.length(); i++) {
			count = 0;
			for (int j = 0; j < name.length(); j++) {
				if (name.charAt(j) == name.charAt(i)
						|| name.charAt(j) == name.charAt(i)) {
					count++;
				}
			}
			System.out.print(" ->"+name.charAt(i) + ":" + count);
		}

	}

}
