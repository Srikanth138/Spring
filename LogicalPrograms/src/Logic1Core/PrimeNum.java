package Logic1Core;

public class PrimeNum {

	public static void main(String[] args) {
		int n = 12;
		boolean b = false;
		int flag = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				/*
				 * b = true; break;
				 */
				flag = flag + 1;
			} else {
				// b = false;
			}
		}

		// if(b) {
		if (flag >= 2) {
			System.out.println("Not a prime number" + n);
		} else {
			System.out.println("Prime Number " + n);
		}

		int i = 0, j = 0;
		for (i = 1; i <= 100; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					b = true;
					break;
				} else {
					b = false;
				}
			} // for i

			if (b) {
				System.out.println("not a prime number" + i);
			} else {
				System.out.println("prime " + i);
			}
		} // for j

	}

}
