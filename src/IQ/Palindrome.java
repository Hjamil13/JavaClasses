package IQ;

public class Palindrome {

	public static void main(String[] args) {
 //Write a Java Program to find whether a String is palindrome or not?
		String str1="Dad";
		 String reverse = "";
	       for (int a = str1.length()- 1;a>=0;a--) {
	           reverse =reverse + str1.charAt(a);
	       }
	       if(str1.equals(reverse)) {
	           System.out.println( "true");
	       }else {
	           System.out.println("fales");
}
	}

}
