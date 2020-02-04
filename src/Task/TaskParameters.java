package Task;

public class TaskParameters {
	
	

	//Create a method that will take 2 parameters as a numbers and prints which number is larger
	//Create a method that will take a number and prints whether the number is even or odd. 
	// Create a method that will print whether given String is palindrome or not.
	
	public static void main(String[]args) {
TaskParameters obj=new TaskParameters();
obj.largerNumber(10,20);
obj.evenOrOdd(50);
obj.palindrome("dad");
	}		
void largerNumber(int num1,int num2) {
if (num1>num2) {
System.out.println(num1 +" "+ "is a larger number");
}else {
System.out.println(num2 +" "+ "is a larger number");	
}
}

void evenOrOdd(int num) {
if(num%2==0) {
System.out.println(num +" "+"is an even number");
}else {
System.out.println(num +" "+"is an odd number");	
}
}

void palindrome(String name) {
String revers="";

for(int i=name.length()-1;i>=0;i--) {
revers=name.charAt(i)+revers;	
if(name.equals(revers)) {
System.out.println(name+" "+ "is a polindrome");	
}
}

	}}

		
		