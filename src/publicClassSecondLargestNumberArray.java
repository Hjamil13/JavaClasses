import java.util.Arrays;

public class publicClassSecondLargestNumberArray {

	public static void main(String[] args) {
		int[] array={20,5,16,90,81,3};
		//Arrays.sort(array);
//Array.sort(array)={3,5,16,20,81,90};
//second largest number=(array.length-2)		
for(int i=0;i<(array.length-2);i++)	{
}
	System.out.println("second largest number in array is :"+array[array.length-2]);



// Maximum and minimum number in the array?
int maximum=array[0];
int minimum=array[0];
for(int i=1;i<array.length;i++) {

	if(array[i]>maximum) {
		maximum=array[i];
	}
	else if
	(array[i]<minimum)
	minimum=array[i];
}
	System.out.println("maximum number in array is :"+maximum);
	System.out.println("minimum number in array is :"+minimum);
	}
}
