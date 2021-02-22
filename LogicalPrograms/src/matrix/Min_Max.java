package matrix;

public class Min_Max {
	public static void main(String[] args) {
		int a[] = {10, 5, 20, 30, 40, 50,25,45};
		int min = a[0], max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min+" "+max);

	}
}
