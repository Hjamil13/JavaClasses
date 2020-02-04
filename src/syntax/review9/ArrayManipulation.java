package syntax.review9;

public class ArrayManipulation {
	public int largestNumber(int[] array) {
		int max = array[0];

		for (int element : array) {
			if (element > max) {
				max = element;
			}
		}

		return max;
	}

	public static int sumOfArray(int[] array) {
		int total = 0;

		for (int element : array) {
			total += element;
		}

		return total;
	}
}

//here is the public class Application {
//public static void main(String[] args) {
	//int[] arr = { 5, 8, 2, 9, 13, 6 };
	
	//int sum = ArrayManipulation.sumOfArray(arr);
	//System.out.println("The sum of the array is: " + sum);
	
	//ArrayManipulation obj1 = new ArrayManipulation();
	//int largest = obj1.largestNumber(arr);
	//System.out.println("The largest number is: " + largest);
