package matrix;

public class Min_Max {
	int a[] = {72, 10, 5, 20, 30, 40, 50, 25, 45, 60, 1, -1};
	int min = a[0], max = a[0];

	void minMax() {
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("MIN Value :: " + min + " MaxValue :: " + max);
	}

	public static void main(String[] args) {
		Min_Max m = new Min_Max();
		m.minMax();

	}
}
