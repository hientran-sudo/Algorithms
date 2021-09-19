
public class Bubble {
	static int arr[] = { 9, 24, 12, 1, 3, 8 };

	public static void main(String[] args) {
		sort();
		print();
	}

	public static void sort() {
		for (int i = 1; i < arr.length - 1; i++) {
			for (int a = 0; a < arr.length - 1; a++) {
				if (arr[a] > arr[a + 1]) {
					int temp = arr[a];
					arr[a] = arr[a + 1];
					arr[a + 1] = temp;
				}
			}
		}
	}

	public static void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
