
public class Insertion {
	static int arr[] = { 9, 12, 1, 24, 8, 3, 4 };

	public static void main(String[] args) {
		sort();
		print();

	}

	static void sort() {
		for (int j = 0; j < arr.length - 1; j++) {
			int i = j + 1;
			while (i < arr.length) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				i++;
			}
		}
	}

	static void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
