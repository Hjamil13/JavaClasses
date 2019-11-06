
public class publicSwapNumbersWithoutTemp {

	public static void main(String[] args) {
		//Java Program to swap two numbers  without 
		// using temporary variable 
		int a=10;
		int b =20;
		System.out.println("before swapping");
		System.out.println("value of a is :"+a);
		System.out.println("value of b is :"+b);
		a=a+b; //30
		b=a-b; //30-20=10
		a=a-b; //30-10
		System.out.println("after swapping");
		System.out.println("value of a is :"+a);
		System.out.println("value of b is :"+b);
		
		String str1="love";
		String str2="you";
		System.out.println("before swapping");
		System.out.println(str1.concat(str2));
		
		System.out.println("after swapping");
		str1=str1+str2;
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		System.out.println("string after swapping is :"+str1 +str2);

	}

}
