
public class Selection {
	static int arr[] = { 9, 12, 24, 1, 8, 3 };
	static int a = 0, j = 0;

	public static void main(String[] args) {
		Sort();
		print();

	}

	public static void Sort() {
		for (int n = 0; n < arr.length; n++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[i] < arr[a]) {
					int temp = arr[i];
					arr[i] = arr[a];
					arr[a] = temp;
				}
			}
			j++;
			a++;
		}

	}
	
	public static void print() {
		for (int b = 0; b < arr.length; b++) {
			System.out.println(arr[b]);
		}
	}
}
